package com.stringbuilder.demo;

public class ReverseUsingStrBuilder 
{
    public static String reverseString(String str)
    {
    	StringBuilder sb=new StringBuilder(str);
    	sb.reverse();
    	return sb.toString();
    }
}
