package com.cjc;

public class OddIndex
{
   public static void main(String[] args) 
   {
	   String s="Welcome To Complete Java Classes";
	   for(int i=0;i<=s.length()-1; i++)
	   {
		   if(i%2!=0)
		   {
			   System.out.println("Char at"+" "+ i+" "+"Place"+"  "+ s.charAt(i));
		   }
	   }
   }
}
