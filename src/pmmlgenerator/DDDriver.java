/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator;

import java.util.ArrayList;
import java.util.List;
import pmmlgenerator.util.*;
import pmmlgenerator.PMML42.*;       
import static pmmlgenerator.PMMLGenerator.dddriver;

/**
 *
 * @author Angel Salamanca
 */
public class DDDriver {
    
    public IntDuple categoricalString;
    public IntDuple categoricalStringValues;
    
    public IntDuple categoricalInteger;
    public IntDuple categoricalIntegerValues;
    
    public IntDuple ordinalString;
    public IntDuple ordinalStringValues;
    
    public IntDuple ordinalInteger;
    public IntDuple ordinalIntegerValues;
    
    public IntDuple continuousInteger;
    public IntDuple continuousIntegerValues;
    public IntDuple continuousIntegerIntervals;
    
    public IntDuple continuousFloat;
    public IntDuple continuousFloatValues;
    public IntDuple continuousFloatIntervals;
            
    public IntDuple continuousDouble;
    public IntDuple continuousDoubleValues;
    public IntDuple continuousDoubleIntervals;
    
    private List<DataField> dfList;
    private NameGenerator nameGenerator;
    private String[] closures = {"openClosed", "openOpen", "closedOpen", "closedClosed"};
    
    public List<DataField> getDataFields() throws Exception
    {
        this.nameGenerator = new NameGenerator(null);
        this.dfList = new ArrayList<DataField>();
        
        this.dfList.addAll(addCategoricalString());
        this.dfList.addAll(addCategoricalInteger());
        this.dfList.addAll(addOrdinalString());
        this.dfList.addAll(addOrdinalInteger());
        this.dfList.addAll(addContinuousInteger());
        this.dfList.addAll(addContinuousFloat());
        this.dfList.addAll(addContinuousDouble());
        
        return dfList;
    }
    
    private List<DataField> addCategoricalString() throws Exception
    {
        List<DataField> myDfs = new ArrayList<DataField>();
        
        for (int i=0; i<categoricalString.actualNumber;  i++)
        {
            DataField df = new DataField();
            df.setOptype(OPTYPE.CATEGORICAL);
            df.setDataType(DATATYPE.STRING);
            df.setName(nameGenerator.getDataFieldName("String"));
            df.setDisplayName("Display "  + df.getName() );
            categoricalStringValues = new IntDuple(2,10);
            if (nameGenerator.doubleValue()<0.75)
            {                
                createValues(categoricalStringValues, DATATYPE.STRING, df);
            }
            
            myDfs.add(df);
        }
        return myDfs;
    }
    
     private List<DataField> addCategoricalInteger() throws Exception
    {
        List<DataField> myDfs = new ArrayList<DataField>();
        
        for (int i=0; i<categoricalInteger.actualNumber;  i++)
        {
            DataField df = new DataField();
            df.setOptype(OPTYPE.CATEGORICAL);
            df.setDataType(DATATYPE.INTEGER);
            df.setName(nameGenerator.getDataFieldName("Integer"));
            df.setDisplayName("Display "  + df.getName() );
           createValues(categoricalIntegerValues, DATATYPE.INTEGER, df);
            
            myDfs.add(df);
        }
        return myDfs;
    }
    
        private List<DataField> addOrdinalString() throws Exception
    {
        List<DataField> myDfs = new ArrayList<DataField>();
        
        for (int i=0; i<ordinalString.actualNumber;  i++)
        {
            DataField df = new DataField();
            df.setOptype(OPTYPE.ORDINAL);
            df.setDataType(DATATYPE.STRING);
            df.setName(nameGenerator.getDataFieldName("String"));
            df.setDisplayName("Display "  + df.getName() );
            createValues(ordinalStringValues, DATATYPE.STRING, df);
               
            myDfs.add(df);
        }
        return myDfs;
    }
           
    private List<DataField> addOrdinalInteger() throws Exception
    {
        List<DataField> myDfs = new ArrayList<DataField>();
        
        for (int i=0; i<ordinalInteger.actualNumber;  i++)
        {
            DataField df = new DataField();
            df.setOptype(OPTYPE.ORDINAL);
            df.setDataType(DATATYPE.INTEGER);
            df.setName(nameGenerator.getDataFieldName("Integer"));
            df.setDisplayName("Display "  + df.getName() );
           createValues(ordinalIntegerValues, DATATYPE.INTEGER, df);
            
            
            myDfs.add(df);
        }
        return myDfs;
    }
    
    private List<DataField> addContinuousInteger() throws Exception
    {
        List<DataField> myDfs = new ArrayList<DataField>();
        
        for (int i=0; i<continuousInteger.actualNumber;  i++)
        {
            DataField df = new DataField();
            df.setOptype(OPTYPE.CONTINUOUS);
            df.setDataType(DATATYPE.INTEGER);
            df.setName(nameGenerator.getDataFieldName("Integer"));
            df.setDisplayName("Display "  + df.getName() );
            if (this.nameGenerator.doubleValue()<0.7) {
                       createIntervals(continuousIntegerIntervals, DATATYPE.INTEGER, df);
            }
            if (this.nameGenerator.doubleValue()<0.7) {
                createValues(continuousIntegerValues, DATATYPE.INTEGER, df);
            }            
            myDfs.add(df);
        }
        return myDfs;
    }
    
      private List<DataField> addContinuousFloat() throws Exception
    {
        List<DataField> myDfs = new ArrayList<DataField>();
        
        for (int i=0; i<continuousFloat.actualNumber;  i++)
        {
            DataField df = new DataField();
            df.setOptype(OPTYPE.CONTINUOUS);
            df.setDataType(DATATYPE.FLOAT);
            df.setName(nameGenerator.getDataFieldName("Float"));
            df.setDisplayName("Display "  + df.getName() );
            if (this.nameGenerator.doubleValue()<0.7) {
                createIntervals(continuousFloatIntervals, DATATYPE.FLOAT, df);
            }
            if (this.nameGenerator.doubleValue()<0.7) {
                createValues(continuousFloatValues, DATATYPE.FLOAT, df);
            }         
            myDfs.add(df);
        }
        return myDfs;
    }
      
        private List<DataField> addContinuousDouble() throws Exception
    {
        List<DataField> myDfs = new ArrayList<DataField>();
        
        for (int i=0; i<continuousDouble.actualNumber;  i++)
        {
            DataField df = new DataField();
            df.setOptype(OPTYPE.CONTINUOUS);
            df.setDataType(DATATYPE.DOUBLE);
            df.setName(nameGenerator.getDataFieldName("Double"));
            df.setDisplayName("Display "  + df.getName() );            
            if (this.nameGenerator.doubleValue()<0.7) {
                createIntervals(continuousDoubleIntervals, DATATYPE.DOUBLE, df);
            }
            if (this.nameGenerator.doubleValue()<0.7) {
                createValues(continuousDoubleValues, DATATYPE.DOUBLE, df);
            }
            myDfs.add(df);
        }
        return myDfs;
    }

          private void createValues(IntDuple valuesDuple, DATATYPE myType, DataField datafield)
            throws Exception
    {
        ArrayList<Value> myList = new ArrayList<Value>();
                  
        if (valuesDuple.actualNumber == 0)
         { return ; }
              
      
        switch(myType)
        {
            case STRING:
                  for (int i=0; i<Math.min(2, valuesDuple.actualNumber); i++)
                 {
                   Value myValue = new Value();
                   myValue.setValue(nameGenerator.stringValue(3));
                  myList.add(myValue);

                 }
                              break; 
            case INTEGER:
                ArrayList<Integer> values = nameGenerator.intValues(valuesDuple.actualNumber);
                
                  for (int i=0; i<valuesDuple.actualNumber; i++)
                  {
                        Value myValue = new Value();
                        myValue.setValue(String.valueOf(values.get(i)));
                       myList.add(myValue);
                  }
            break;
                
            case DOUBLE:
                
                if (datafield.getInterval()!=null)
                {
                    if (datafield.getInterval().size()>0)  // otherwise we generate missing for all rows
                            {
                                Value myValue = new Value();
                               myValue.setValue(this.nameGenerator.missingDoubleValue());
                               myValue.setProperty("missing");               
                               myList.add(myValue);          
                            }
                }
                
                              
                break;
                
            case FLOAT:
                ArrayList<Float> fValues = nameGenerator.floatValues(valuesDuple.actualNumber);
                
                  for (int i=0; i<valuesDuple.actualNumber; i++)
                  {
                        Value myFloatValue = new Value();
                        myFloatValue.setValue(Float.toString(fValues.get(i)));
                       myList.add(myFloatValue);
                  }
            break;
                
                
            default:
                throw new Exception("Not implemented");
       
        }
        for (Value value : myList)
        {
            datafield.getValue().add(value);
        }
        
    }
          
         private void createIntervals(IntDuple intervalsDuple, DATATYPE myType, DataField datafield)
                  throws Exception
    {
        ArrayList<Interval> myList = new ArrayList<Interval>();
        intervalsDuple.refresh(); // to have more variety across Data Fields
        
        if (intervalsDuple.actualNumber == 0)
         { return ;}
        
        switch(myType)
        {
            case DOUBLE:
            case FLOAT:
                  ArrayList<Double> dValues = nameGenerator.doubleValues(1+intervalsDuple.actualNumber);                 
                                    
                  for (int i = 0; i<intervalsDuple.actualNumber; i++)
                  {
                      Interval myInterval = new Interval();  
                      myInterval.setClosure(nameGenerator.pickOne(closures));
                      myInterval.setLeftMargin(dValues.get(i));
                      myInterval.setRightMargin(dValues.get(i+1));
                      myList.add(myInterval);
                  }
                  
                break;
             
            case INTEGER:
                  ArrayList<Integer> iValues = nameGenerator.intValues(1+intervalsDuple.actualNumber);                 
                                    
                  for (int i = 0; i<intervalsDuple.actualNumber; i++)
                  {
                      Interval myInterval = new Interval();  
                      
                      myInterval.setLeftMargin((double)iValues.get(i));
                      myInterval.setRightMargin((double)iValues.get(i+1));
                      
                      if (myInterval.getLeftMargin()+1 == myInterval.getRightMargin())
                      {
                          myInterval.setClosure("closedOpen");
                      }
                      else
                      {
                           if (myInterval.getLeftMargin() == myInterval.getRightMargin())
                            {
                                 myInterval.setClosure("closedClosed");
                             }
                           else                               
                           {
                                // {"openClosed", "openOpen", "closedOpen", "closedClosed"};
                                myInterval.setClosure(nameGenerator.pickOne(closures));
                            }
                        }        
                      // The case where it's openopen and 
                      myList.add(myInterval);
                  }
      
                break;
                
            default:
                break;
        }
        
        for (Interval interval : myList)
        {
            datafield.getInterval().add(interval);
        }
        return;
        }
        
}





