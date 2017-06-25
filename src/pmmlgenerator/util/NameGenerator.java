/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.Random;
import java.util.*;
/**
 *
 * @author Angel Salamanca
 */
public class NameGenerator {
    
    private Random randomGenerator;
   
    public NameGenerator()
    {
        randomGenerator = new Random();
    }
    
    public String getDataFieldName(String fieldType)
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("DataField ");
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
        for (int i=0;  i<numValues; i++)
        {
            values.add(randomGenerator.nextInt(100));
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
     
     public Boolean booleanValue()
     {
         return randomGenerator.nextBoolean();
     }
             
      public  <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = randomGenerator.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
