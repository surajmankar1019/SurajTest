package com.test;

public class Demo 
{
   public static void main(String[] args) 
   {
	  String s1="ABC";
	  String s2="abc";
	  String s3=new String("ABC");
	  
	  System.out.println(s1.equals(s2));
	  System.out.println(s1==s2);
	  System.out.println(s1.equals(s3));
	  System.out.println(s1==s3);
   }
}
