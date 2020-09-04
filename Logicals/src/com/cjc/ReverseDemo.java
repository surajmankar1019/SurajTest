package com.cjc;

import java.util.Scanner;

public class ReverseDemo 
{
    public static void main(String[] args) 
    {
	    int a,b;
	    int d=0;
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any Number:");
	    a=sc.nextInt();
	    
	    while(a>0)
	    {
	    	b=a%10;
	    	a=a/10;
	    	d=(d*10)+b;
	    	
	    }
	    System.out.println("Reverse Number is:"+d);
	}
}
