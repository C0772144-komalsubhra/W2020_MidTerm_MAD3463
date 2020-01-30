/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import java.util.Objects;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools
{
    //1 - REVERSE STRING

   public static String reverse(String s) {
       String rev = "";
       int length = s.length();

       for (int i = length - 1 ; i >= 0 ; i--)
           rev = rev + s.charAt(i);
         return rev;

   }

    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s)
    {

        if (s.length() == 0) {
            return s;
        }

        System.out.print(Character.toUpperCase(
                s.charAt(0)));


        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(
                        s.charAt(i + 1)));
        }
        return s;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static char mostFrequent(String s)
    {
        final int ASCII_SIZE = 256;

        int count[] = new int[ASCII_SIZE];


        int len = s.length();
        for (int i=0; i<len; i++)
            count[s.charAt(i)]++;

        int max = -1;
        char mostFrequent=' ';


        for (int i = 0; i < len; i++) {
            if (max < count[s.charAt(i)]) {
                max = count[s.charAt(i)];
                mostFrequent= (char) max;
            }
        }

        return mostFrequent;
    }


    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) {
        int decimal = 0;
        int p = 0;
        while(true){
            if(s.equals(0)){
                break;
            } else {
                int temp =s%10;
                decimal += temp*Math.pow(2, p);
                s = s/10;
                p++;
            }
        }
        return decimal;
    }
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {

     findString=  originalString.replace(originalString,findString);
     newString=findString.replace(findString,newString);
        return newString;
    }

}
