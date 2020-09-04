package com.armstrong;

import java.util.Scanner;

public class Armstrong 
{
	
	
	
   public static void main(String[] args) 
   {
	   int num,original,result,d1,d2,d3;
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter A Three Digit number To Check An Armstrong or Not");
	   num = sc.nextInt();
	   original=num;
	   
	   // Find Digits
	   
	   d1=num%10;
	   num=num/10;
	   d2=num%10;
	   num=num/10;
	   d3=num%10;
	   
	   /*System.out.println("D1="+d1);
	   System.out.println("D2="+d2);
	   System.out.println("D3="+d3);*/
	   
	   // Find Cube And Sum
	   
	   result=d1*d1*d1+d2*d2*d2+d3*d3*d3;
	   
	   if(result==original)
	   {
		   System.out.println("Given Number Is An Armstrong");
	   }
	   else
	   {
		   System.out.println("Given Number Is Not An Armstrong");
	   }
   }
}
