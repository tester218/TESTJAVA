package com.jyothi.practice;

public class Prime {
	private void prime() {

		int a = 157;
		int count = 0;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

	// no of prime numbers between 1 to 50
	private void first50Prime() {
		for (int i = 2; i <= 50; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;

				}
			}
			if(count==0) {
				System.out.println(i+" prime");
			}
			else {
				System.out.println(i+" not prime");
			}
		}

	}

	public static void main(String[] args) {
		Prime p = new Prime();
		p.prime();
		p.first50Prime();
	}

}
