package com.array;

import java.util.Scanner;

public class ArraySumAvg 
{
    public static void main(String[] args) 
    {
	    Scanner sc=new Scanner(System.in);
	    int num=0;
	    int total=0;
	    float avg=0;
	    System.out.println("Enter Any Input Number");
	    num=sc.nextInt();
	    
	    int [] myArray=new int[num];
	    System.out.println("Enter Value");
	    
	    for(int i=0;i < num;i ++)
	    {
	      myArray[i]=sc.nextInt();
	      total=total+myArray[i];
	    }
	    System.out.println("Sum="+total);
	    
	   // for Average
	    
	    avg=(float)total/num;
	    System.out.println("Average Of Values Is="+avg);
	}
}
