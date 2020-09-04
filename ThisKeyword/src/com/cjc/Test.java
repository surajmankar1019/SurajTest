package com.cjc;

public class Test 
{
	 public Test()  
	    {  
//		 We Cant assign reference to this variable it gives compile time error
//	        --------- this = null; ----- 
//		 Because already this keyword is points/refers to current object this is final reference
	        System.out.println("Test class constructor called");  
	    }  
	    public static void main (String args[])  
	    {  
	        Test t = new Test();  
	    }  
}
