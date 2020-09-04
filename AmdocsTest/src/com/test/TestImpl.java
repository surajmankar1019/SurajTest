package com.test;

public class TestImpl 
{
	public int add(int x, int y) {
	    
	    
	      return x+y; 
		}
	
	public static void main(String[] args) {
		TestImpl testImpl=new TestImpl();
		testImpl.add(10, 20);
		System.out.println(testImpl.add(10, 20));
	}
		
}
