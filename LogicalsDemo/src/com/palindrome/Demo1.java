package com.palindrome;

public class Demo1 
{
   public static void main(String[] args) 
   {
	  int r;
	  int sum=0;
	  int temp;
	  
	  int n=141;
	  
	  temp=n;
	  
//	  Get The number to check palindrome:-  
	  r=n%10;
	  sum=(sum*10)+r;
	  n=n/10;
	  
	  for(int i=0;i<=10;i++)
	  {
		  System.out.println(i);
	  }
   }
}
