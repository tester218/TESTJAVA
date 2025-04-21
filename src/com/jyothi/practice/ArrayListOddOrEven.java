package com.jyothi.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOddOrEven {
	int[] l = { 1, 4, 5, 9, 6, 7, 8 };

	public void elementEvenOrOdd() {

		for (int i = 0; i <= l.length - 1; i++) {
			// check the element even or odd
			if (l[i] % 2 == 0) {
				System.out.println(l[i] + " Even");
			} else {
				System.out.println(l[i] + " Odd");
			}
		}
	}

	public void seperateOddEvenElements() {
		List<Integer> even = new ArrayList<>();
		int evenCount = 0;

		List<Integer> odd = new ArrayList<Integer>();
		int oddCount = 0;
		for (int i = 0; i <= l.length - 1; i++) {
			if (l[i] % 2 == 0) {
				even.add(l[i]);
				evenCount++;
			} else {
				odd.add(l[i]);
				oddCount++;
			}
		}
		System.out.println("Even elements=" + even + " total even count " + evenCount);
		System.out.println("Odd elements=" + odd + " total odd count " + oddCount);

	}

	public void seperateOddEvenByIndex() {
		List<Integer> evenIndex = new ArrayList<Integer>();
		List<Integer> oddIndex = new ArrayList<Integer>();

		for (int i = 0; i <= l.length - 1; i++) {
			if (i % 2 == 0) {
				evenIndex.add(l[i]);
			} else {
				oddIndex.add(l[i]);
			}
		}
		System.out.println("Even Index " + evenIndex);
		System.out.println("Odd Index " + oddIndex);
	}

	public static void main(String[] args) {

		ArrayListOddOrEven obj = new ArrayListOddOrEven();
		obj.elementEvenOrOdd();
		obj.seperateOddEvenElements();
		obj.seperateOddEvenByIndex();
	}

}
