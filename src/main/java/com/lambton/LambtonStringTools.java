/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s) {

        String rev = "";
        if(s!=null) {
            char ch[] = s.toCharArray();

            for (int i = ch.length - 1; i >= 0; i--) {
                rev += ch[i];
            }


        }
        else{
            rev="Output"+rev;
        }
        return rev;
    }

    
    //2 - FORMAT INITIALS OF STRING
        public static String initials(String s)
    {
        String [] letters=s.split("//s+");
      String newword="";
      if(letters.length==3)
      {
          newword=letters[0].substring(0,1).toUpperCase() + "." +
                  letters[1].substring(0,1).toUpperCase() + "." +
                  letters[2].substring(0,1).toUpperCase() + "." +
                  letters[2].substring(1).toLowerCase();
      }
      else {
          newword= null;
      }
      return newword;

    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static char mostFrequent(String s) {

        int countofcharacter = 256;
        int[] count = new int[countofcharacter];
        int i;
        for (i = 0; i < s.length(); i++)
            (count[s.charAt(i)])++;
        int mostFrequent = 0;
        for (i = 0; i < countofcharacter; i++)
        {
            if (count[i] > count[mostFrequent])
            {
                mostFrequent = i;
            }
            else if (count[i] == count[mostFrequent])
            {
                mostFrequent = i;
            }
        }
        return (char) mostFrequent;
    }


    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       int decimal=0;
       //decimal=Integer.parseInt(s,2);
        return decimal;




    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {

         originalString=originalString.toLowerCase();
         findString=findString.toLowerCase();
         newString=newString.toLowerCase();
         if(originalString.contains(findString))
         {
             originalString=originalString.replace(findString,newString);
             return originalString;
         }
         else
             return "string not found";

    }
}
