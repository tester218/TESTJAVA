package com.jyothi.practice;

public class PalandromeNumber {

	private void palandrom() {
		int num = 12321;
		int originalNumber = num;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		if (originalNumber == rev) {
			System.out.println("The given number is a Pallendrome " + originalNumber);
		} else {
			System.out.println("The given number is a not palendrom " + originalNumber);
		}

	}

	public static void main(String[] args) {
		PalandromeNumber p = new PalandromeNumber();
		p.palandrom();
	}
}
