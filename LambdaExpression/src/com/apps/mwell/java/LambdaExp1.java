package com.apps.mwell.java;

import com.apps.mwell.service.Sayable;

public class LambdaExp1
{
     public static void main(String[] args) 
     {
	    Sayable s=()->
	    {
	    	return "I have Nothothing to say";
	    };
	    
	    System.out.println(s.say());
	 }
}
