package com.Basics.Programs;

public class PerfectNumber {
	public static void main(String args[]) {
		PerfectNumber p = new PerfectNumber();
		p.Number(8128);
	}
	public void Number(int n) {
		int count = 0;
		for(int i=1;i<n;i++)
		{
			if(n%i == 0) {
				count = count +i;
			}
		}
		if(count == n) {
			System.out.printf("%d is a perfect number",n);
		}
		else
		{
			System.out.printf("%d is not a perfect number",n);
		}
	}

}
