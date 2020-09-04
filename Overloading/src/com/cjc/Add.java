package com.cjc;

public class Add 
{
    static int add(int a,int b)
    {
    	return a+b;
    }
    
    static double add(int a,int b,int c)
    {
    	return a+b+c;
    }
    
    public static void main(String[] args) 
    {
	    Add a=new Add();	
	    System.out.println(Add.add(10, 20));
	}
}
