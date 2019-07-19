/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Relax
 */
public class TextPractice {
    private ArrayList<String> lines=new ArrayList<String>();
    private Map<String, Integer> errorChar = new HashMap<>();
    private ArrayList<String> currentLine=new ArrayList<>();
    private int currentWord=0;
    private int lineCounter=0;
    private int currentLineCounter=0;
    private int numberOfCorrectCharacters=0;
    public void increase_numberOfCorrectCharacters(int num)
    {
        numberOfCorrectCharacters+=num;
    }
    public void increase_CurrentWord()
    {
        currentWord+=1;
        if(currentWord>=currentLine.size())
        {
        setNewLine();
        currentWord=0;
        }
    }
    public String getCurrentWord()
    {
      if(currentWord>=currentLine.size())
            return "";
        return currentLine.get(currentWord);
    }
    private int CurrentlineNumber=0;
    public void setText(String txt)
    {
        String [] textLine=txt.split("\n");
        for (String tl : textLine) {
            String cleanedLine=tl.replaceAll("^ +| +$|( )+", "$1");
            if(cleanedLine.length()==0)continue;
            lines.add(cleanedLine);
        }
    }
    /**
     *
     * @param numberOfLines
     * @return
     */
    public ArrayList<String> getLines(int  numberOfLines)
    {
        ArrayList<String> lineRecieved=new ArrayList<String>();
        int temp=lineCounter;
        for (;lineCounter<lines.size() &&lineCounter<(temp +numberOfLines) ;lineCounter++ )
                lineRecieved.add(lines.get(lineCounter));
        return lineRecieved;
    }
    public void setNewLine()
    {
        currentLine.clear();
        currentLine.addAll(Arrays.asList(lines.get(currentLineCounter).split(" ")));
        currentLineCounter++;
    }
    public boolean compareWord(String orginal, String userInput)
    {
        boolean correct=true;
        for(int i=0;i<orginal.length();i++)
            if(i>=userInput.length() || orginal.charAt(i)!=userInput.charAt(i))
            {
                String key=(orginal.charAt(i)+"");
                errorChar.put(key , errorChar.getOrDefault(key, 0) + 1 );
                correct=false;
            }
        return correct;
    }
    
}
