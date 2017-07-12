/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.util.*;
import javax.xml.parsers.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*;
import pmmlgenerator.util.*;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.DOMImplementation;

/**
 *
 * @author Angel Salamanca
 */
public class DerivedFieldBuilder {

     private DerivedField field;
     private NameGenerator generator;
     private Context context;
     private  Integer randomSwitch;
     
    public DerivedFieldBuilder(DerivedField thisField, NameGenerator thisGenerator, Context thisContext)
    {
        this.field = thisField;
        this.generator = thisGenerator;
        this.context = thisContext;
    }

    public DerivedField build() throws Exception
    {
        DATATYPE datatype = this.field.getDataType();
        Integer numFields = this.context.getFieldUniverse().numFields();
       
        switch(datatype)
        {
            case STRING:
                randomSwitch = generator.intValue(1, 3);
                 switch(randomSwitch)
                 {
                    case 1:
                        return constantField(datatype);
                    case 2:
                        return fieldRefField(datatype);
                    case 3:
                        return mapValuesField();
                 }
            case FLOAT:
            case DOUBLE:
            case INTEGER:
                randomSwitch = generator.intValue(1, 9);
                  switch(randomSwitch)
        {
            case 1:
                return constantField(datatype);
            case 2:
                return fieldRefField(datatype);
            case 3:
                if (this.field.getDataType()==DATATYPE.DOUBLE || this.field.getDataType() == DATATYPE.FLOAT)
                {
                    return normContinuousField();
                }
                else
                {
                    return constantField(datatype); // INTEGER not allowed for this
                }
            case 4:
            if ((this.field.getDataType()==DATATYPE.DOUBLE || this.field.getDataType() == DATATYPE.FLOAT) && numFields>30)
                {
                    return normDiscreteField();
                }
                else
                {
                    return constantField(datatype);
                }
            case 5:


                 if (this.field.getDataType()==DATATYPE.STRING)
                {
                    return discretizeField();
                }
                else
                {
                    return fieldRefField(datatype); // STRING, INTEGER not allowed for this
                }

            case 6:
            case 7:
            case 8:
            case 9:
                return applyField();

            default:
                throw new Exception("Unexpected case");
                }
             default:
                throw new Exception("Unexpected case");
           }
         
        

    }

    private DerivedField constantField(DATATYPE datatype) throws Exception
    {
        Constant constant = new Constant();
        this.field.setConstant(constant);

        constant.setDataType(datatype);
        constant.setValue(this.generator.getValue(constant.getDataType()));

        return this.field;
    }

    private DerivedField fieldRefField(DATATYPE datatype) throws Exception
    {
        FieldRef fieldref = new FieldRef();
        this.field.setFieldRef(fieldref);

        FieldDescriptor fd = this.context.randomField(datatype, true, false,false);
        fieldref.setField(fd.fieldName);
        this.context.affectField(fd.fieldName);

        return this.field;
    }

    private DerivedField normContinuousField() throws Exception
    {
        NormContinuous normc = new NormContinuous();
        this.field.setNormContinuous(normc);

        FieldDescriptor fd = this.context.randomField(this.field.getDataType(), true, false, false);
        normc.setField(fd.fieldName);
        this.context.affectField(fd.fieldName);

        // get an ordered list of doubles, as in intervals.
         ArrayList<Double> dValues = this.generator.doubleValues(this.generator.intValue(2, 7));

         for (int j =0; j<dValues.size();j++)
         {
             LinearNorm ln = new LinearNorm();
             normc.getLinearNorm().add(ln);

             ln.setOrig(dValues.get(j));
             ln.setNorm(this.generator.doubleValue(-1, 1));
         }

        return this.field;
    }

    private DerivedField normDiscreteField() throws Exception
    {
        NormDiscrete normd = new NormDiscrete();
        this.field.setNormDiscrete(normd);

        // pick a String variable to convert to dummy 1/0 var. Could be any categorical but...
        // we also retain datafields only to get easy access to values
        FieldDescriptor fd = this.context.randomField(DATATYPE.STRING, false, false, true);
        String fieldName = fd.fieldName;
        this.context.affectField(fd.fieldName);
        
        FieldHelper fieldhelper = new FieldHelper(fieldName, fd.scope);

        normd.setField(fieldName);
        normd.setMethod("indicator");
        Integer randomcat = this.generator.intValue(0, fieldhelper.getValues().size()-1);
        
        List<Value> values = fieldhelper.getValues();
        String value;
        if (values.size()>0)
        {
             value = fieldhelper.getValues().get(randomcat).getValue();
        }
        else
        {
            value = this.generator.stringValue(3);
        }
        normd.setValue(value);       
        
        return this.field;
    }

     private DerivedField discretizeField() throws Exception
     {
        Discretize discretize = new Discretize();
        FieldDescriptor fd = this.context.randomField(DATATYPE.DOUBLE, false, true,false); // TODO Other CONTINUOUS
        String fieldName = fd.fieldName;
 
        discretize.setField(fieldName);
        this.context.affectField(fd.fieldName);
        discretize.setDefaultValue(this.generator.stringValue(2));
        discretize.setMapMissingTo(this.generator.stringValue(2));
        this.field.setDiscretize(discretize);

        FieldHelper fh = new FieldHelper(fieldName, fd.scope);

        List<Double> intervals = fh.getIntervals(this.generator.intValue(3, 6));

        for (int i=0; i<intervals.size() - 1; i++)
        {
            DiscretizeBin db = new DiscretizeBin();
            Interval interval = new Interval();

            if (i == intervals.size()-1)
            {
                   interval.setClosure("openOpen"); // TODO we should try everything
            }
            else
            {
                interval.setClosure("openClosed"); // TODO we should try everything
            }
            if (intervals.get(i)!=null) {
                interval.setLeftMargin(intervals.get(i));
            }

            if (intervals.get(i+1)!=null) {
                interval.setRightMargin(intervals.get(i+1));
            }

            db.setBinValue(this.generator.stringValue(2));
            db.setInterval(interval);
            discretize.getDiscretizeBin().add(db);
        }
        return this.field;
     }

     private DerivedField applyField() throws Exception
     {
        Apply apply = new Apply();
        this.field.setApply(apply);

        BuiltinFunction function = this.context.getRandomFunction(this.field.getDataType());

        apply.setFunction(function.getName());

        for (String argumentType : function.getArgumentTypes())
        {
            // False derived field
           DerivedField derF = new DerivedField();
           derF.setName("");
           derF.setDataType(this.field.getDataType());
           derF.setOptype(this.field.getOptype());

           DerivedFieldBuilder dfb = new DerivedFieldBuilder(derF, this.generator, this.context);
           derF = dfb.build();
           // TODO get expression
           Object innerExpression = getExpression(derF);
           apply.getEXPRESSION().add(innerExpression);
        }

        return this.field;

        }

     private DerivedField mapValuesField() throws Exception
     {
        MapValues mapvalues = new MapValues();
        this.field.setMapValues(mapvalues);

        String inputColumnName = "inputcol_" + generator.stringValue(3);
        String outputColumnName = "outputcol_" + generator.stringValue(3);
        mapvalues.setOutputColumn(outputColumnName);
        
        FieldDescriptor fd = this.context.randomField(DATATYPE.STRING, true, false, false);
        FieldColumnPair fcpair = new FieldColumnPair();
        fcpair.setField(fd.fieldName);
        this.context.affectField(fd.fieldName);

        fcpair.setColumn(inputColumnName);
        mapvalues.getFieldColumnPair().add(fcpair);
        
        InlineTable inlinetable = new InlineTable();
        mapvalues.setInlineTable(inlinetable);   

        // Create values - TODO base on a DataStringField
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        DOMImplementation domImpl = db.getDOMImplementation();
        Document document = domImpl.createDocument(null, null, null); // "http://www.dmg.org/PMML-4_2", "xmlns", null); //??
       
        Integer numRows = this.generator.intValue(2, 8);
        // Add rows
        for (int i = 0; i< numRows; i++)
        {
            Row row = new Row();
            List<Object> cells = row.getContent();

            Element entryElement = document.createElement(inputColumnName);
            entryElement.setTextContent(this.generator.stringValue(3));
            cells.add(entryElement);
            
            Element resultElement = document.createElement(outputColumnName);
            resultElement.setTextContent(this.generator.stringValue(3));
            cells.add(resultElement);
            
            inlinetable.getRow().add(row);
        }
        
        mapvalues.setDefaultValue(this.generator.stringValue(3));
        mapvalues.setMapMissingTo(this.generator.stringValue(3));
        

         return this.field;
     }

     private Object getExpression(DerivedField derF)
     {
         if (derF.getApply() != null) { return derF.getApply(); }
         if (derF.getConstant() != null) { return derF.getConstant(); }
         if (derF.getDiscretize()!= null) { return derF.getDiscretize(); }
         if (derF.getNormContinuous()!= null) { return derF.getNormContinuous(); }
         if (derF.getNormDiscrete()!= null) { return derF.getNormDiscrete(); }
         if (derF.getFieldRef() != null) { return derF.getFieldRef(); }
          if (derF.getMapValues() != null) { return derF.getMapValues(); }

         return null;
}






}
