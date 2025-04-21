package com.jyothi.practice;

public class MaxNum {
	private void maxNum() {
		int[] num = { 1, 34, 5, 632, 4, 6 };
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		System.out.println(num[0]);
	}

	public static void main(String[] args) {
		MaxNum max = new MaxNum();
		max.maxNum();
	}

}
