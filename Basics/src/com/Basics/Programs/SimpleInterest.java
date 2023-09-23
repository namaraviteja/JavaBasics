package com.Basics.Programs;

import java.math.BigDecimal;

public class SimpleInterest {
	
	private BigDecimal principal ;
	private BigDecimal interest;
	public SimpleInterest(String string , String string2) {
		BigDecimal principal = new BigDecimal(string);
		this.principal = principal;
		BigDecimal interest = new BigDecimal(string2);
		this.interest = interest;
	}
	public BigDecimal calculateTotalValue(int year) {
		BigDecimal years = new BigDecimal(year);
		BigDecimal total = principal.add(((principal).multiply(interest)).multiply(years));
		return total;
		
	}
	public static void main (String args[]) {
		SimpleInterest s = new SimpleInterest("4500.00","7.5");
		
		System.out.println(s.calculateTotalValue(5));
	}

}
