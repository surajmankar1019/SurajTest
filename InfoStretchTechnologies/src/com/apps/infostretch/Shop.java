package com.apps.infostretch;

import java.io.*;
import java.util.Scanner;


public class Shop 
{
	static Scanner sc=new Scanner(System.in);
	static int coins[]={1,2,3,5};
    static int notes[]={10,20,50,100,500,2000};
    
	public static void main(String[] args) throws  IOException 
	{
		/*// create object of buffer class.
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));*/
	    
	 // The Rsominations in an array
	    
		/*int j = 0;
		while (j<notes.length){
			System.out.println(notes[j]);
			j++;
		}*/
			
	 // enter the Bill amount you want.
	    System.out.println("Enter Bill Amount :");
	    
	 // to store amount.
     	int billAmount=sc.nextInt();
     	
    
		
     // Enter Paid Amount you want
     	System.out.println("Enter Paid Amount : \n");
     	
//     	to store amount.
     	int paidAmount=sc.nextInt();
     	
      // enter the amount you want.
         System.out.print("Enter Return Amount : "); 
         
      // to store amount.
 		int returnAmount=paidAmount-billAmount;
 		System.out.println(returnAmount);
 		
 		for(int coins=1;coins<4;coins++)
 		{
 			System.out.println(coins);
 			
 		}
 		for(int i=0;i<notes.length;i++)
	 		{
	 			System.out.println(notes[i]);
	 		}
 		
	}
}
