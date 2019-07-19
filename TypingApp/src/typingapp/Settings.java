/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingapp;

/**
 *
 * @author Relax
 */
public abstract class Settings 
{
    private static String languageCode = "";
    private static String languageName = "";
    
    public static String getLanguageCode()
    {
        return languageCode;
    }

    public static void setLanguageCode(String aLanguageCode)
    {
        languageCode = aLanguageCode;
    }

    public static String getLanguageName() {
        return languageName;
    }

    public static void setLanguageName(String aLanguageName) {
        languageName = aLanguageName;
    }
}
