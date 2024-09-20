package com.Task2;

public class TestCase2 {
public static void main(String[] args) {
	int n =13;
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
			
		}
		if(count==2)
		{
			System.out.println("primeno");
		}
	}
}
}
