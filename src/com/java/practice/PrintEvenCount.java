package com.java.practice;

public class PrintEvenCount {

	public static void main(String[] args) {
//		int evenCount=0;	
//		int evenSum=0;
//		int oddCount=0;
//		int oddSum=0;
//		for(int i=0; i<=90; i++) {
//			if(i%2==0) {
//				evenCount++;
//				evenSum= evenSum+i;
//			}
//			else {
//				oddCount++;
//				oddSum= oddSum+i;
//			}
//		}
//		System.out.println("even number count between 1 to 90 is "+evenCount);
//		System.out.println("sum of the even number between 1 to 90 is "+evenSum);
//		System.out.println("odd number count between 1 to 90 is  "+oddCount);
//		System.out.println("sum of the odd numbers between 1 to 90 is "+oddSum);
		
		
		int num =12345;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse of a number "+rev);
	}
	
}
