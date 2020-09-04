package com.constructorchainingwiththis;

public class Employee 
{
     int id,age;
     String name,address;
     
     public Employee(int id)
     {
    	 this.id=id;
     }
     public Employee(int id,int age)
     {
    	 this(id);
    	 this.age =age ;
     }
     public Employee(int id,int age,String name,String address)
     {
    	 this(id,age);
    	 this.name=name;
    	 this.address=address;
     }
     
     public static void main(String[] args) 
     {
	     Employee emp=new Employee(101,29,"Suraj","Pune");
	     System.out.println("ID: "+emp.id+" "+"Age: "+emp.age+" "+"Name: "+emp.name+" "+"Address: "+emp.address);
	 }
}
