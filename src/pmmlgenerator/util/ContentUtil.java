/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

import java.util.*;

/**
 *
 * @author Angel Salamanca
 */
public class ContentUtil {
    
    public Object getFromContent(List<Object> content, String name){
        
        if (content == null)
        {
            return null;
        }
        
        for (Object item: content)
        {
            if (item.getClass().getSimpleName().equals(name))
            {
                return item;
            }
        }
        return null;
    }
 
    public void addToContent(List<Object> content, Object item)
    {
        content.add(item);
    }
    
    public void setContent(List<Object> content,  List<Object> newContent)
    {
         
        for (Object o : newContent)
        {
            content.add(o);
        }
    }
    
}