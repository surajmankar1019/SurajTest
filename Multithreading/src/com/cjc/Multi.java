package com.cjc;

public class Multi extends Thread
{
    public void run()
    {
    	System.out.println("Thread is Running");
    }
    
    public static void main(String[] args) 
    {
	   Multi m=new Multi();
//	   m.run();
	   m.start();
	}
}
