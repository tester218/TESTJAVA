package com.java.practice;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        String name = "Ganesh Varma";
//        char ch;
//        String reverse ="";
//        for(int i=name.length()-1;i>=0;i--){
//        	ch =name.charAt(i);
//            reverse = ch+reverse;
//        }
//        System.out.println(reverse);
//        }
//}



  // Import the Scanner class

class Main {
  public static void main(String[] args) {
	  int evenSum=0;
	  int oddSum=0;
	  int countEven = 0;
	  int countOdd = 0;
	  int[] l = {1,3,4,4,6,7,7,8,9};
	  for(int i=0;i<=l.length-1;i++) {
		  if(l[i]%2==0) {
			  countEven++;
			  evenSum=evenSum+l[i];
		  }
		  else {
			 
			  countOdd++;
			  oddSum=oddSum+l[i];
		  }
		  
	  }
	  System.out.println("Even number count "+countEven);
	  System.out.println("Odd number count "+countOdd);
	  System.out.println("sum of even numbers "+evenSum);
	  System.out.println("sum of odd numbers "+oddSum);
  }
}






//public class EmployeeDetails {
//	int speedlimit=80;
//	int i=5;//instance variable
//	private int add(int i,int j) {
//		
//		return i+j;
//		}
//	public static void main(String[] args) {
//		EmployeeDetails obj= new EmployeeDetails();
//		System.out.println(obj.i);
//		System.out.println( obj.add(10,20));
//		
//		float speedlimit ;
//		System.out.println();
//	}
//}

//QUESTION 1:
//------------
//     Project   :EmployeeDetails
//     Package   :org.emp
//     Class     :Employee 
//     Methods   :empId(),empName(),empDob(),empPhone(),empEmail(),empAddress()
//
//Description:
//Create an object for employee class and call above methods also follow the all coding standards.
