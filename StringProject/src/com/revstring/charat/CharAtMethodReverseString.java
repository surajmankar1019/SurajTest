package com.revstring.charat;

import java.util.Scanner;

public class CharAtMethodReverseString 
{
   public static void main(String[] args) 
   {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String You Want to Reverse");
	    
	    String str=sc.nextLine();
	    
	    String reverse="";
	    
	    for(int i=str.length()-1;i>=0;i--)
	    {
	    	reverse=reverse+str.charAt(i);
	    	
	  
	    }
	    
	    System.out.println(reverse);
   }
}
