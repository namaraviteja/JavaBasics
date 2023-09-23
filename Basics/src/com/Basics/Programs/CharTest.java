package com.Basics.Programs;

public class CharTest {
	private char c;
	public CharTest(char c){
		this.c = c;
	}
	public boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		else if (c == 'A' || c == 'E'|| c =='I' || c =='O' || c =='U') {
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isNumber() {
		if(((int)c >= 48) && ((int)c <=57 )) {
			return true ;
		}
		else
		{
			return false ;
		}
	}
	public boolean isAlphabet() {
		if((int)c >= 97 && (int)c <= 122)
		{
			return true;
		}
		if((int)c >=65 && (int)c <= 90 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void printLowerCaseAlphabets() {
		for(char i = 97 ; i<= 122 ;i++) {
			System.out.println((char)i);
		}
	}
	public static void printUpperCaseAlphabets() {
		for(char i = 97 ; i<= 122 ;i++) {
			System.out.println(Character.toUpperCase((char)i));
			
		}
	}

	public static void main(String[] args) {
		CharTest t = new CharTest('7');
//		CharTest.printLowerCaseAlphabets();
//		CharTest.printUpperCaseAlphabets();
		System.out.println(t.isAlphabet());
		System.out.println(t.isNumber());
		System.out.println(t.isVowel('V'));

	}

}
