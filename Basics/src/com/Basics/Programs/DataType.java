package com.Basics.Programs;

import java.math.BigDecimal;

public class DataType {
	
	public static void main (String args[]) {
		int i = 0X1233;
		System.out.println(i);
		i = 07;
		System.out.println(i);
		i++;
		System.out.println(i);
		double b = 34.978784;
		double c =  67.90922;
		double d = b +c ;
		System.out.println(d);
		BigDecimal num1 = new BigDecimal("34.8955050");
		BigDecimal num2 = new BigDecimal("78.387");
		System.out.println(num1.add(num2));
		
				

	}

}
