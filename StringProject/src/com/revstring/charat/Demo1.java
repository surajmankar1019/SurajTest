package com.revstring.charat;

import java.util.Scanner;

public class Demo1 
{
    public static void main(String[] args) 
    {
	     Scanner stringRev=new Scanner(System.in);
	     System.out.println("Enter A String You Want to Reverse \n");
	     
	     String str=stringRev.nextLine();
	     
	     String reverse="";
	     
	     for(int i=str.length()-1;i>=0;i--)
	     {
	    	 reverse=reverse+str.charAt(i);
	     }
	     
	     System.out.println("Reverse String Will Be: \n"+reverse);
	}
}
