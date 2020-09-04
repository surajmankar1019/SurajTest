package com.javatpoint;

public class CharAtDemo 
{
    public static void main(String[] args) 
    {
	   String name="Suraj";
	   char ch=name.charAt(4); 
	   System.out.println(ch);// j
	   
	   
//	   -------------------  Java String charAt() Example 2  ----------------
//	   In this object the size of index is greater than Strng name="Suraj" that why it gives Exception
	   
	   /*char ch1=name.charAt(5);
	   System.out.println(ch1);// java.lang.StringIndexOutOfBoundsException: String index out of range: 5
*/	
    
//  -------------------  Java String charAt() Example 3  ----------------
//    Let's see a simple example where we are accessing first and last character from the provided string.
    
    
	     	String str="Welcome To Complete Java Classes";
	     	int strLength=str.length();
	     	
	     	//Fetching First Charector
	     	System.out.println("Charector at 0 index is:"+str.charAt(4));
    }    	
	
}
