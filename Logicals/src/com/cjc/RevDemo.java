package com.cjc;

public class RevDemo 
{
   public static void main(String[] args) 
   {
	    int arr[]=new int[]{1,2,3,4,5};
	    int i;
	    
	    System.out.println("For Original Array");
	    
	    for(i=1;i<=arr.length;i++)
	    {
	    	System.out.println(i);
	    }
	    
	    System.out.println("Array For Reverse Order");
	    
	    for(i=arr.length-1;i>=0;i--)
	    {
	    	System.out.println(arr[i]);
	    }
   }
}
