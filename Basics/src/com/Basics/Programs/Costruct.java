package com.Basics.Programs;

public class Costruct {
	Costruct(){
		this("pop");//using this keyword we can reuse parametarized constructor
		System.out.println("this is deafult constructor");		
	}
	Costruct(String word)
	{
		System.out.println(word);
	}
	public static void main(String args[]) {
		Costruct c = new Costruct();
		Costruct c1 = new Costruct("push");
		BiNumber num= new BiNumber(2,3);
		System.out.println(num.add());
		System.out.println(num.multiply());
		num.doub();
		System.out.println(num.getNumber1());
		System.out.println(num.getNumber2());
	}
	

}
