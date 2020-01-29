/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;
import java.util.regex.Pattern;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)

    {
        Pattern pattern = Pattern.compile("\\str");

        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        //  is whitespace and store in temp array.
        String[] temp = pattern.split(s);
        String result = " ";
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                result = s[i] + result;
            }
            else
                result = " " + s[i] + result;
        }
        return result;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
