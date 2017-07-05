/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.Random;
import java.util.*;
import jaxb.gdsmodellica.pmmlgenerator.PMML42.*; 

/**
 *
 * @author Angel Salamanca
 */
public class NameGenerator {
    
    private Random randomGenerator;
    private Map<String,Integer> fieldNums;
   
    public NameGenerator()
    {
        randomGenerator = new Random();
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
        
        sb.append("DerivedField ");
        sb.append(fieldType);
        sb.append(" ");
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
        int varNum = randomGenerator.nextInt(99999);
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
                throw new Exception("Unexpected field type");        
        }
               
        return String.valueOf(varNum);
    }
    
    public String stringValue(int numChars)
    {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < numChars) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }

        return salt.toString();
    }
    
    public ArrayList<Integer> intValues(int numValues)
    {
        ArrayList<Integer> values = new ArrayList<Integer>();
        
        
        while (values.size()<numValues)
        {
            Integer generated = randomGenerator.nextInt(100);
            if (!values.contains(generated));
                {values.add(generated);}
        }
        Collections.sort(values);
        return values;
        
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
     
     public int intValue(int a , int b)
     {
         Integer i = randomGenerator.nextInt(b-a+1)+a;
         return i;
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
            switch(datatype)
            {
                case STRING:
                    // Try values
                    List<Value> v =  df.getValue();
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
                            String m = e.getMessage();
                        }
                    }
                    // Try values
                     v =  df.getValue();
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
                     v =  df.getValue();
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
                    return String.valueOf(this.doubleValue(-50,50));
                default:
                      throw new Exception("getValue");
            }
        }
}
