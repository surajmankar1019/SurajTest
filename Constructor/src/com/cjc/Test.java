package com.cjc;

public class Test 
{
    public Test(int a,int b)
    {
    	System.out.println("a="+a+"b="+b);
    }
    
    public Test(int a,float b)
    {
    	System.out.println("a="+a+"b="+b);
    }
    public static void main(String[] args) 
    {
    	byte a=10;
    	byte b=20;
	    Test t=new Test(a,b);	
	}
}   
     
