package com.Basics.Programs;

public class ObjectExample {
	private int count; //default value is 0
	private String a; // default value is null
	//since we have private variables to use them , we need public methods
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		System.out.println(a);
		System.out.println(this.a);
		this.a = a;
	}

}
