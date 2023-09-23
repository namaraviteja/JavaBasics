package com.Basics.Programs;

public class Encaps {
//enacapsulation is aabout hide data releated to particular object and restricts access . we can access only through the objects of the class
	//getter and setter methods will be used for accessing enacapsulated variables
	public static void main(String[] args) {
		ObjectExample oe = new ObjectExample();
		oe.setA("Girl");
		//System.out.println(oe.getA());
		oe.setCount(60);
		System.out.println(oe.getCount());
	}

}
