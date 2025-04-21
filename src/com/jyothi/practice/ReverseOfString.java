package com.jyothi.practice;

public class ReverseOfString {
	private void stringReverse() {
		String s ="hi";
		String rev="";
		for(int i=0;i<=s.length()-1;i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		ReverseOfString obj = new ReverseOfString();
		obj.stringReverse();
	}

}
