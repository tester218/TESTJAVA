package com.jyothi.practice;

public class ReverseOfNum {

	private void reveraseInteger() {

		int num = 123;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		ReverseOfNum obj = new ReverseOfNum();
		obj.reveraseInteger();
	}
}
