package com.home.notes.common;

public class PrimeTest {

	public static void main(String[] args) {

		double x = 6;
		double maxF = (Math.sqrt(x));
		System.out.println(maxF);
		for (double i = 2; i <= maxF; i++) {
			if (x % i == 0) {
				System.out.println("x is not a prime.");
				break;
			}
			
		}
		System.out.println("x is a prime.");
	}

}
