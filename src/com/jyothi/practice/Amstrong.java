package com.jyothi.practice;

public class Amstrong {
	public void amstrong() {
		int num = 153;
		int originalNum = num;	
		int noOfDigits = String.valueOf(num).length();
		int amg =0;
		while(num>0) {
			int digit =(num%10);
			amg+= Math.pow(digit, noOfDigits);
			num/=10;
		}
	
		if(amg==originalNum) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("not Amstrong");
		}

	}
	
	public static void main(String[] args) {
		Amstrong obj =new Amstrong();
		obj.amstrong();
	}

}
