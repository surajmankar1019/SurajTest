package com.cjc.scenerio;

public class Propagation 
{
   void m()
   {
	   int i=50/0;
   }
   void n()
   {
	   m();
   }
   void p()
   {
	   try
	   {
		   n();
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception Catched");
	   }
	   
   }
   public static void main(String[] args) 
   {
	   Propagation obj=new Propagation();
	   obj.p();	
	   System.out.println("normal Flow");
   }
}
