package com.cjc;

public class Test1 
{
	int test_a, test_b;  
     Test1(int a, int b)   
    {  
    test_a = a;   
    test_b = b;   
    }  
    public static void main (String args[])   
    {  
        Test1 test = new Test1(10,1);   
        System.out.println(test.test_a+" "+test.test_b);  
    }  
}
