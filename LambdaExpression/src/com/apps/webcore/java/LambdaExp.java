package com.apps.webcore.java;

public class LambdaExp 
{
    public static void main(String[] args) 
    {
	    Sayable s=()->
	    {
	    	return "Mark My Word You Are The Best Coader In Java Development";
	    };
	    
	    System.out.println(s.say());
	    
	}
}
