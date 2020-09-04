package com.cjc;

public class Test 
{
	int rollno;
	String name;
    static String college="NYSS";
    
    public Test(int r,String n)
    {
    	rollno=r;
    	name=n;
    }
    void display()
    {
    	System.out.println(rollno+" "+name+" "+college);
    	
    }
    public static void main(String[] args) {
		
    	Test t1=new Test(101,"Suraj");
    	Test t2=new Test(102,"Shailesh");
    	t1.display();
    	t2.display();
    	
	}
}
