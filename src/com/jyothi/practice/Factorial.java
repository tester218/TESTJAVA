package com.jyothi.practice;

public class Factorial {
	private void fact() {

		int i =5;
		int fac =1;
		
		while(i>0) {
			fac*=i;
			i--;
		}
		System.out.println(fac);
	}
	public static void main(String[] args) {
		Factorial f= new Factorial();
		f.fact();
	}

}
