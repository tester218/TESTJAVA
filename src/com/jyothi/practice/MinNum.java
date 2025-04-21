package com.jyothi.practice;

public class MinNum {
	private void minNumInOrder() {
		int[] num = { 900, 1, 3, 6, 2, 4, 9 };
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
			System.out.println(num[0]);
	}
	public static void main(String[] args) {
		MinNum min= new MinNum();
		min.minNumInOrder();
	}
}
