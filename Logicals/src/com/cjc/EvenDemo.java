package com.cjc;

public class EvenDemo 
{
   public static void main(String[] args) 
   {
	   int arr[]=new int[]{1,2,3,4,5,6,7};
	   int i;
	   
	   System.out.println("Array for Even order is:");
	   
	   for(i=1;i<=arr.length;i=i+2)
	   {
		   System.out.println(i);
	   }
   }
}
