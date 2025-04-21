package com.jyothi.practice;

public class SumOfDigits {
	public void sumOfDigits() {

		int num = 123456789;
		int sum =0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		SumOfDigits obj= new SumOfDigits();
		obj.sumOfDigits();
	}

}
