package com.Task3;

public class Bank {

	
	public void deposit(int amount)throws Exception
	{
	
		throw new NegativeException("negativeno");
	

	}


	public static void main(Stringargs[])
	{
		try {
		Bank b=new Bank();
		  b.deposit(-10);
		}
		catch(NegativeException n)
		{
			System.out.println("catchblock");
		}
	}

	
