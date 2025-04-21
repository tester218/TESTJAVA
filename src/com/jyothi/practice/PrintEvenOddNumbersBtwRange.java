package com.jyothi.practice;

public class PrintEvenOddNumbersBtwRange {

	private void range1to100() {
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " Even");
				evenCount++;

			}

			else {
				System.out.println(i + " Odd");
				oddCount++;
			}
		}
		System.out.println("even count =" + evenCount);
		System.out.println("odd count =" + oddCount);
	}

	public static void main(String[] args) {
		PrintEvenOddNumbersBtwRange obj = new PrintEvenOddNumbersBtwRange();
		obj.range1to100();
	}

}
