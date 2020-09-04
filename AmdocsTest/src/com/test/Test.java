package com.test;

public class Test {
	
	private Test(int a)
	{
		
	}
	
	public static void main(String args[]) throws Exception, IllegalAccessException
	{
		Class c=Class.forName("Test");
		Test t=(Test)c.newInstance();
		System.out.println(t.getClass().getName());
		
	}

}
