package com.jyothi.practice;

public class Swipe {
//with 3rd variable
	private void swipe() {
		int a =5;
		int b=10;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		int temp =a;
		a=b;
		b=temp;
		System.out.println("swape a is "+a);
		System.out.println("swape b is "+b);
		
	}
	private void withoutVariable() {

		int a =5;
		int b=10;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}
	private void secondMethod() {
		int a=5;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

	}
	public static void main(String[] args) {
		Swipe obj= new Swipe();
		obj.swipe();
		obj.withoutVariable();
		obj.secondMethod();
	}
}
