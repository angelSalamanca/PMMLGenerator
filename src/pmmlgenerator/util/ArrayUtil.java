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
    
    public static REALSparseArray buildRealSparseArray(ModelContext context) throws Exception
    {
        boolean existingIndex;
        
        REALSparseArray rsa = new REALSparseArray();
        
        int totalLength = context.generator.intValue(10, 100);
        rsa.setN(new BigInteger(String.valueOf(totalLength)));
        
        int numIndices = context.generator.intValue(5, totalLength);
        
        if (context.generator.doubleValue()<0.2)
        {
                rsa.setDefaultValue(context.generator.doubleValue(-10,10));     
        }
        
        for (int i=0; i<numIndices; i++)
        {
            do
            {
                int j = context.generator.intValue(1, totalLength);
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
    
    public static ArrayType buildRealArray(ModelContext context) throws Exception
    {
        
        ArrayType arraytype = new ArrayType();            
        StringBuilder sb = new StringBuilder();
        Integer n = context.generator.intValue(5, 20);
        BigInteger bin = new BigInteger(String.valueOf(n));
        arraytype.setN(bin);     
        
         List<String> elements = new ArrayList<String>();
         
          for (int i =0; i<n;i++)
                    {
                        sb.append(String.valueOf(context.generator.doubleValue(-10,10)));
                        if (i<(n-1))
                        {
                            sb.append(" ");                        
                        }
                    }
                    
          arraytype.setType("real");
          arraytype.setContent(sb.toString());
                    
        return arraytype;
        
    }
}
