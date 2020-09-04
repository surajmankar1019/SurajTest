package com.cjc;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListReverse 
{
	 public static void main(String args[]){  
		    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		           list.add("Ravi");//Adding object in arraylist  
		           list.add("Vijay");  
		           list.add("Ravi");  
		           list.add("Ajay");  
		            
		           System.out.println("Traversing list through List Iterator:");  
		           //Here, element iterates in reverse order  
		              ListIterator<String> list1=list.listIterator(list.size());  
		              while(list1.hasPrevious())  
		              {  
		                  String str=list1.previous();  
		                  System.out.println(str);  
		              }  
	 }          
}
