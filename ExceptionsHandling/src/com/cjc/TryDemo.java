package com.cjc;

public class TryDemo 
{
    public static void main(String[] args) 
    {
    	try
    	{
	     int i=1;
	     System.out.println(i/0);
    	}
    	finally
    	{
    		System.out.println("Rest of the code");
    	}
	}
}
