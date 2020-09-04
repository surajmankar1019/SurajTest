package com.cjc;

public class StringDemo 
{
    public static void main(String[] args) 
    {
//	     String name="Suraj";
//	     name.concat("Mankar");
//	     String name1=name.concat("Mankar");
//	     System.out.println("Name:-"+name);//Only Object is created
//	    System.out.println("Name:-"+name.concat("Mankar"));
	     
//	     System.out.println(name.hashCode());
//	     
	     String s=new String("Suraj");
	     s.concat("Mankar");
	     System.out.println(s);
	     System.out.println(s.hashCode());// @ Object is Created one is SCP And Second Is in Heap Memory
	}
    
}
