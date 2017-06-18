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
public class Sentence {
    
    private String[] words = {"alcazar", "bingle", "canorous", "deedy", "flews", "gaita", "higgler", "ingurgigate", "jumentouous", "kenspeckle", "lobola", "martlet", "nagware"}; 
    private Random randomGenerator;
    
    public Sentence()
    {
        randomGenerator = new Random();
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
