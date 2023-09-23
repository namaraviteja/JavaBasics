package com.Basics.Programs;

public class PrimeNumber {

	void primeList(int endnumber) {
		int counter = 0;
		for (int i = 2; i <= endnumber; i++) {
			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {
					counter++;
				}

			}
			if (counter < 2) {
				System.out.println(i + "\n");
			}
			counter = 0;
		}
	}
}
