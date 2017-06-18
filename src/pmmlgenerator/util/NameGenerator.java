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
            values.add((randomGenerator.nextDouble()-0.5)*100);
        }
        Collections.sort(values);
        return values;
        
    }
    
     public ArrayList<Float> floatValues(int numValues)
    {
        ArrayList<Float> values = new ArrayList<Float>();
        for (int i=0;  i<numValues; i++)
        {
            double rNum = (randomGenerator.nextDouble()-0.5)*100;
            values.add((float)rNum);
        }
        Collections.sort(values);
        return values;
        
    }
     
     public String pickOne(String[] words)
     {
         return words[randomGenerator.nextInt(words.length)];
     }
     
     public String missingDoubleValue()
     {
         Double d = 9999*(1+(randomGenerator.nextDouble()-0.5)*100);
         return d.toString();
     }
     
}
