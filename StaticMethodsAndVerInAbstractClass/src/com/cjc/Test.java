package com.cjc;

abstract class Test 
{
    static int id=10;
    
    public static void testMethod()
    {
    	if(id<=10)
    	{
    	System.out.println("Hii !! This Static method is accessed in Abstract class ");
    	}
    	else
    	{
    		System.out.println("Hii !! This Static method is Not accessed in Abstract class ");
    	}
    }
    
    public static void main(String[] args) 
    {
	     Test.testMethod();
	     System.out.println("id= "+Test.id);
	}
}
