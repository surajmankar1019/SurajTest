package com.deno.prct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class CountNotes
{
	int billAmount;
	int paidAmount;
	int returnAmount;
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])throws IOException
	{
		// create object of buffer class.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// The Rsominations in an array
		int Rs[]={1000,500,100,50,20,10,5,2,1}; 
		
		//Enter Bill Amount
		System.out.println("Enter Bill Amount :");
		int billAmount=sc.nextInt();
		
		//Enter Paid Amount
		System.out.println("Enter Paid Amount :");
		int paidAmount=sc.nextInt();
		
		// enter the amount you want.
		System.out.print("Enter Return Amount : "); 
		
		// to store amount.
		int returnAmount=paidAmount-billAmount;
		System.out.println(returnAmount);
//		int returnAmount1=Integer.parseInt(br.readLine());
 
		// create copy of the amount
		int copy=returnAmount; 
		int totalNotes=0,count=0;
 
		System.out.println("\nRs OMINATIONS : \n");
 
		// check for notes.
		for(int i=0;i<9;i++) 
		{
			// count number of notes.
			count=returnAmount/Rs[i]; 
			if(count!=0) 
			{
				System.out.println(Rs[i]+"\tx\t"+count+"\t= "+Rs[i]*count);
			}
			totalNotes=totalNotes+count; //finding the total number of notes
			returnAmount=returnAmount%Rs[i]; //finding the remaining amount whose Rsomination is to be found
		}
 
		System.out.println("--------------------------------");
		
		// printing the total amount
		System.out.println("TOTAL\t\t\t= "+copy); 
		System.out.println("--------------------------------");
		
		// printing the total number of notes
		System.out.println("Total Number of Notes\t= "+totalNotes); 
	}
	
}