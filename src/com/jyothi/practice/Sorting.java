package com.jyothi.practice;

import java.util.Arrays;

public class Sorting {

	private void ascendingOrder() {
		int[] num = {3,8,2,43,90,1,34};
		Arrays.sort(num);
		System.out.println("Ascending order" +Arrays.toString(num));
	}
	private void descendingOrder() {
		int[] num = {3,8,2,43,90,1,34};
		Arrays.sort(num);
		int[] dec = new int[num.length];
		for(int i=0;i<num.length;i++) {
			dec[i] = num[num.length-1-i];
		}
		System.out.println("Descending order"+Arrays.toString(dec));
	}
	private void ascendingOrderUsingSwap() {

		int[] num = {3,8,2,43,90,1,34};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int k=0;k<=num.length-1;k++) {
			System.out.println(num[k]);}

	}
	
	private void descendingOrderUsingSwap() {
		int[] num = {3,8,2,43,90,1,34};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}
		}
		for(int k=0;k<num.length;k++) {
			System.out.println(num[k]);
		}
	}
	public static void main(String[] args) {
		Sorting s = new Sorting();
//		s.ascendingOrder();
//		s.descendingOrder();
//		s.ascendingOrderUsingSwap();
		s.descendingOrderUsingSwap();
	}
}
