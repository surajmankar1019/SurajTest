package com.cjc;

public class EvenArray 
{
     
   public static void main(String[] args) 
   {
	   int arr[]=new int[]{1,2,3,4,5,6};
	   int i;
	 System.out.println("Element is in Even Order is:");
	 // Element is in Even means it is incremented By 2
	 for(i=0;i<=arr.length;i=i+2)
	 {
		 System.out.println(i);
	 }
   }
}
