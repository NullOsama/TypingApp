/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingapp;

import java.util.ArrayList;

/**
 *
 * @author Relax
 */
public class TextPractice {
    private ArrayList<String> lines=new ArrayList<String>();
    
    
    public void setText(String txt)
    {
        String [] textLine=txt.split("\n");
        for (String tl : textLine) {
            String cleanedLine=tl.replaceAll("^ +| +$|( )+", "$1");
            if(cleanedLine.length()==0)continue;
            lines.add(cleanedLine);
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
