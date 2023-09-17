package com.Basics.Programs;

public class FibonacciSeries {
	
	int i = 1;
	int j = 1;
	
	
	
	public void fibonacci(int num)
	{
		if (num==1)
		{
			System.out.println("1");
		}
		
		else if (num ==2)
		{
			System.out.println("1,2");
		}
		
		else 
		{//3
			int count = 1;
			int k;
			System.out.println("1");
			System.out.println("1");
			while (count<num)
			{
				k = i+j;
				System.out.print(k);
				i = j;
				j = k;
				count++;
			}
		}
	}

}
