/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.math.BigInteger;
import java.util.Random;
import java.util.*;
import pmmlgenerator.PMML42.*; 

/**
 *
 * @author Angel Salamanca
 */
public class NameGenerator {
    
    private Context context;
    private Random randomGenerator;
    private Map<String,Integer> fieldNums;
    private String derivedFieldPreffix = "";
    private String[] words = {"alcazar", "bingle", "canorous", "deedy", "flews", "gaita", "higgler", "ingurgigate", "jumentouous", "kenspeckle", "lobola", "martlet", "nagware", "apparel", "befall","commend", "fare"}; 
   
   
    public NameGenerator(Context context)
    {
        randomGenerator = new Random();
       
       // randomGenerator.setSeed(General.seed);
        this.context = context;
        this.fieldNums = new HashMap<String,Integer>();
        this.fieldNums.put("String",1);
        this.fieldNums.put("Integer",1);
        this.fieldNums.put("Float",1);
        this.fieldNums.put("Double",1);       
        
    }
    
    public String getDataFieldName(String fieldType) throws Exception
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("DataField");
        sb.append(fieldType);        
        sb.append(getDataFieldNum(fieldType));
                           
        return sb.toString();
    }
    
      public String getDerivedFieldName(String fieldType)
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.derivedFieldPreffix + "DerivedField ");
        sb.append(fieldType);
        sb.append(" ");
        sb.append(getVarNum());
                           
        return sb.toString();
    }
      
      public void setDerivedPreffix(String preffix)
      {
          this.derivedFieldPreffix = preffix;
      }
      
         public String getOutputFieldName()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("OutputField ");
        sb.append(getVarNum());
                           
        return sb.toString();
    }
         
    public String getDefineFunctionName()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("User Function ");
        sb.append(getVarNum());
                           
        return sb.toString();
    }
    
    
    public String getModelName(String modelFamily)
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append(modelFamily);
        sb.append(" ");
        sb.append(getVarNum());
                           
        return sb.toString();
    }
    
    
    private String getVarNum()
    {
        int varNum;
        
        do
        {
            varNum = randomGenerator.nextInt(99999);
        } while(this.context.varNumExists(varNum));
        
        return String.valueOf(varNum);
    }
    
     private String getDataFieldNum(String fieldType) throws Exception
    {
        int varNum;
        
        try
        {
            varNum = this.fieldNums.get(fieldType);
            this.fieldNums.put(fieldType, 1+varNum);
        }
        catch (Exception e)
        {
                throw new Exception("Unexpected field type",e);        
        }
               
        return String.valueOf(varNum);
    }
    
    public String stringValue(int numChars)
    {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        
        while (salt.length() < numChars) { // length of the random string.
            int index = (int) (this.randomGenerator.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }

        return salt.toString();
    }
    
    public ArrayList<Integer> intValues(int numValues)
    {
        ArrayList<Integer> values = new ArrayList<Integer>();        
        Integer generated = -60;
        
        while (values.size()<numValues)
        {
            generated += 3*(1+randomGenerator.nextInt(25));
            values.add(generated);
        }
        Collections.sort(values);
        
        return values;
        
    }
    
    public List<Integer> intCutoffs(Integer totalObs, Integer numCuts ) throws Exception
    {
        List<Integer> cutoffs = new ArrayList<Integer>();
        Integer a = 0;
        Integer b = totalObs;
        
        for (int i =1; i<numCuts; i++)
        {
            Integer bin = this.intValue(0, b-a);            
            cutoffs.add(bin);
            a = a+ bin;
         }
        // all that remains
        cutoffs.add(totalObs - a);
        return cutoffs;
    }
    
     public ArrayList<Double> doubleValues(int numValues)
    {
        ArrayList<Double> values = new ArrayList<Double>();
        for (int i=0;  i<numValues; i++)
        {
            values.add((this.doubleValue()-0.5)*100);
        }
        Collections.sort(values);
        return values;
        
    }
     
     public ArrayList<Double> double01Values(Integer numValues, Double a, Double b)
     {
          ArrayList<Double> values = this.doubleValues(numValues);
          
          // move to zero
          Double shift = values.get(0);
          for (int i = 0; i<values.size(); i++)
          {
              values.set(i, values.get(i) - shift);
          }
          
          // max to 1
          Double divider = values.get(values.size()-1);
          for (int i = 0; i<values.size(); i++)
          {
              values.set(i, values.get(i)/divider);
          }
          
          // and back
          
          for (int i = 0; i<values.size(); i++)
          {
              values.set(i, values.get(i) * b);
          }
          
           for (int i = 0; i<values.size(); i++)
          {
              values.set(i, values.get(i) + a);
          }
          
          return values;
          
     }
    
     public ArrayList<Float> floatValues(int numValues)
    {
        ArrayList<Float> values = new ArrayList<Float>();
        for (int i=0;  i<numValues; i++)
        {
            double rNum = (this.doubleValue()-0.5)*100;
            values.add((float)rNum);
        }
        Collections.sort(values);
        return values;
        
    }
     
     public String pickOne(String[] words)
     {
         return words[randomGenerator.nextInt(words.length)];
     }
     
       public int pickOne(int[] words)
     {
         return words[randomGenerator.nextInt(words.length)];
     }
     
     public String missingDoubleValue()
     {
         Double d = 10000 + (randomGenerator.nextInt(1000000)-0.5)/1000;
         return d.toString();
     }
     
     public int intValue(int a , int b) throws Exception
     {
         try {
         Integer i = randomGenerator.nextInt(b-a+1)+a;
         return i;
         }
         catch (Exception e) {
             General.witness("intValue: " + String.valueOf(a) + " " +String.valueOf(b));
             throw new RuntimeException("intValue", e);
         }         
     }
     
     public double doubleValue()
     {         
         return (double)Math.round(randomGenerator.nextDouble() * 10000000d) / 10000000d;
     }
     
     public double doubleValue(double a, double b)
     {         
          Double d = randomGenerator.nextDouble()*(b-a)+a;
         return (double)Math.round(d* 10000000d) / 10000000d;
     }
          
     public Boolean booleanValue()
     {
         return randomGenerator.nextBoolean();
     }
             
      public  <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = randomGenerator.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
      
      public String getValue(DataField df) throws Exception
      {
            DATATYPE datatype = df.getDataType();
             List<Value> v =  df.getValue();
             if (this.doubleValue()<0.95)  // most of the time 
             {
                 // remove missing code as a potential value
                 for (Value value : v)
                 {
                     if (value.getProperty().equals("missing"))
                     {
                         v.remove(value);
                         break;
                     }
                 }
             }
              
            switch(datatype)
            {
                case STRING:
                    // Try values
                  
                    if (v.size()>0)
                    {
                        return v.get(this.intValue(0, v.size()-1)).getValue();
                    }
                    
                    // Anything will do
                    return this.stringValue(3);
                case INTEGER:
                    // Try Intervals
                    List<Interval> intervals = df.getInterval();
                    if (intervals.size()>0)
                    {
                        Interval interval = intervals.get(this.intValue(0, intervals.size()-1));
                        Integer leftBound = interval.getLeftMargin().intValue();
                        Integer rightBound = interval.getRightMargin().intValue();
                        switch(interval.getClosure())
                        {
                            case "closedClosed":
                                break;
                            case "openClosed":        
                                leftBound +=1;
                                break;
                            case "closedOpen":        
                                rightBound -=1;
                                break;
                            case "openOpen":        
                                rightBound -=1;
                                leftBound +=1;                                 
                        }                        
                        try
                        {
                        Integer iValue = leftBound + this.intValue(0, rightBound-leftBound);
                      
                        return String.valueOf(iValue);
                          }
                        catch (Exception e)
                        {
                            throw new Exception("getValue", e);
                        }
                    }
                    // Try values
                    if (v.size()>0)
                    {
                        return v.get(this.intValue(0, v.size()-1)).getValue();
                    }
                    // Anything will do
                    return String.valueOf(this.intValue(-50, 50));
                case DOUBLE:
                case FLOAT:    
                    // Try Intervals
                    intervals = df.getInterval();
                    if (intervals.size()>0)
                    {
                        Interval interval = intervals.get(this.intValue(0, intervals.size()-1));
                        Double leftBound = interval.getLeftMargin();
                        Double rightBound = interval.getRightMargin();
                        
                        Double dValue = leftBound + this.doubleValue(0, rightBound-leftBound);
                        return String.valueOf(dValue);
                    }
                    // Try values
                    if (v.size()>0)
                    {
                        return v.get(this.intValue(0, v.size()-1)).getValue();
                    }
                    // Anything will do
                    return String.valueOf(this.doubleValue(-20,20));
                    
                default:
                    throw new Exception("getValue");
            }
      }
      
        public String getValue(DATATYPE dataType) throws Exception
        {
            switch(dataType)
            {
                case STRING:
                    return this.stringValue(4);
                case INTEGER:
                    return String.valueOf(this.intValue(-50,50));
                case FLOAT:
                case DOUBLE:
                    double d = this.doubleValue(-50,50);
                    return String.valueOf(d);
                default:
                      throw new Exception("getValue");
            }
        }
        
        public DATATYPE pickDataType() throws Exception
        {            
            return DATATYPE.valueOf(this.pickOne(General.dfDataTypes));
        }
        
        public ArrayType getArray(FieldDescriptor fd) throws Exception
        {
            ArrayType arraytype = new ArrayType();
            String xmlQuote = "\"";
            StringBuilder sb = new StringBuilder();
            Integer n = this.intValue(1, 7);
            BigInteger bin = new BigInteger(String.valueOf(n));
            arraytype.setN(bin);           
            
            List<String> elements = new ArrayList<String>();
            
            switch(fd.datatype)
            {
                case STRING:
                    for (int i =0; i<n;i++)
                    {
                        sb.append(xmlQuote);
                        sb.append(this.stringValue(3));
                        sb.append(xmlQuote);
                        if (i<(n-1))
                        {
                            sb.append(" ");                        
                        }
                    }
                    arraytype.setType("string");
                    break;
                case INTEGER:
                           for (int i =0; i<n;i++)
                    {                        
                        sb.append(String.valueOf(this.intValue(-10,10)));
                        if (i<(n-1))
                        {
                            sb.append(" ");                        
                        }
                    }
                    arraytype.setType("int");       
                    break;
                case FLOAT:
                case DOUBLE:
                    for (int i =0; i<n;i++)
                    {
                        sb.append(String.valueOf(this.doubleValue(-10,10)));
                        if (i<(n-1))
                        {
                            sb.append(" ");                        
                        }
                    }
                    arraytype.setType("real");
                    break;
                default:
                    throw new Exception();
            }            
            
            arraytype.setContent(sb.toString());
            
          return arraytype;
        }
        
    public String getSentence(int numWords)
    {
        StringBuilder sb = new StringBuilder();
        
        for (int i =0; i<numWords; i++)
        {
            int wordIndex = randomGenerator.nextInt(words.length-1);
            sb.append(words[wordIndex]);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }
}
