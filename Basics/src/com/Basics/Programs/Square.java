package com.Basics.Programs;

public class Square {

	public static void main(String[] args) {
		Square s = new Square();
		s.squareOfNum(10);
	}
	public void squareOfNum(int n)
	{
		int sum=0;
		while(n>0) {
			sum = sum + n*n;
			n--;
		}
		System.out.println(sum);
	}

}
