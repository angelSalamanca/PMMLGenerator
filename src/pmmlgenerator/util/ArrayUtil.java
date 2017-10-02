/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import pmmlgenerator.PMML42.*;
import pmmlgenerator.*;

/**
 *
 * @author Angel Salamanca
 */
public class ArrayUtil {
    
    public static REALSparseArray buildRealSparseArray(ModelContext context, BigInteger totalLength) throws Exception
    {
        boolean existingIndex;
        
        REALSparseArray rsa = new REALSparseArray();
        
        rsa.setN(new BigInteger(String.valueOf(totalLength)));
        
          
        int intLength = totalLength.intValue();        
   
        int numIndices = context.generator.intValue(2, intLength);
        
        if (context.generator.doubleValue()<0.2)
        {
                rsa.setDefaultValue(context.generator.doubleValue(-10,10));     
        }
        
        for (int i=0; i<numIndices; i++)
        {
            do
            {
                int j = context.generator.intValue(1, intLength);
                existingIndex = rsa.getIndices().contains(j);
                if (!existingIndex)
                {
                    rsa.getIndices().add(j);
                    rsa.getREALEntries().add(context.generator.doubleValue(-1, 1));
                }
                
            } while (existingIndex);            
        }
        
        return rsa;
    }
    
    public static ArrayType buildRealArray(ModelContext context,  BigInteger totalLength) throws Exception
    {
        
        ArrayType arraytype = new ArrayType();            
        StringBuilder sb = new StringBuilder();
      
        arraytype.setN(totalLength);     
        
         List<String> elements = new ArrayList<String>();
         
         //  for (BigInteger bi = BigInteger.valueOf(5);            bi.compareTo(BigInteger.ZERO) > 0;             bi = bi.subtract(BigInteger.ONE)) {

          for (BigInteger i  = BigInteger.valueOf(0);  i.compareTo(totalLength)<0; i = i.add(BigInteger.ONE))
                    {
                        sb.append(String.valueOf(context.generator.doubleValue(-10,10)));
                        if (i.compareTo(totalLength.add(BigInteger.ONE)) < 0)
                        {
                            sb.append(" ");                        
                        }
                    }
                    
          arraytype.setType("real");
          arraytype.setContent(sb.toString());
                    
        return arraytype;
        
    }
}
