package com.cjc;

public class Demo2 
{
     public void finalize()
     {
    	 System.out.println("object is garbage collected");
     }
     
     public static void main(String[] args) 
     {
	    Demo2 d=new Demo2();
	    Demo2 d1=new Demo2();
	    d=null;
	    d1=null;
//	    d.finalized();
	    System.gc(); 	
	    
	 }
}
