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
    public static String reverse(String s)
    {
        char ch[] = s.toCharArray();
        String rev= "";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev+=ch[i];
        }

        return rev;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        String [] str=s.split("//s+");



    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       int decimal=0;
       if(decimal=Integer.parseInt(s,2))
       {
           return decimal;
       }
       else return 0;


    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
         //String s1,s2,s3;
         //s1=originalString.toLowerCase();
         //s2=findString.toLowerCase();
         //s3=newString.toLowerCase();
    }
}
