package com.cjc;

public class Calculator extends Exception
{
   public Calculator()
   {
	   System.out.println("Calculations class is instantiated");
   }
   
   public void add(int a,int b) 
   {
	   System.out.println("Adding Starts");
	   System.out.println("Total no = "+(a+b));
	   System.out.println("Addition Completed");
   }
   
   public static void main(String[] args)  
   {
	   try
	   {
		   throw new Calculator();
	   }
	   catch(Calculator c)
	   {
		   c.add(30,40);
	   }
   }
}
