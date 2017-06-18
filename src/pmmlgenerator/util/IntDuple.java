/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.Random;

/**
 *
 * @author Angel Salamanca
 */
public class IntDuple {
    int a;
    int b;
    
    Random randomGenerator;
    
    public int actualNumber;
    
    public IntDuple(int aa, int bb)
    {
        a=aa;
        b=bb;      
        
        this.randomGenerator = new Random();
        this.refresh();
         }
    
    public void refresh()
    {
        actualNumber = a + randomGenerator.nextInt(b-a+1); 
    }
    
    
}
