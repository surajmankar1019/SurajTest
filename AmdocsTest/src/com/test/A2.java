package com.test;

public class A2 extends A1{
	
	public static void main(String args[])
	{
		A1 a=new A2();
		a.setName("new test");
		System.out.println(a.getName());
	}

}
