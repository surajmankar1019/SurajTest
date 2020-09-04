package com.cjc.impl;

public class Multi implements Runnable 
{

	@Override
	public void run() 
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) 
	{
	   Multi m=new Multi();
	   Thread t1=new Thread(m);
	   t1.start();
	}

}
