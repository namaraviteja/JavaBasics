package com.Basics.Programs;

public class Fibbonocci {

	public static void main(String[] args) {
		Fibbonocci f = new Fibbonocci();
		f.fibbonocci(60);
	}
	public void fibbonocci(int i)
	{
		int count = 0;
		if(i == 0) {
			System.out.println("There is no fibbonocci series");
		}
		else if (i == 1) {
			System.out.printf("Fibbonocci Series of your choice:%d",i);
		}
		else {
			int j= count;
			int k = count +1;
			count = k;
			while(count <=i)
			{
				System.out.printf("%d %d %d ",j,k,count);
				j = count +k;
				k = j + count;
				count = j +k;
			}
			System.out.printf("%d %d ",j,k);
		}
	}

}
