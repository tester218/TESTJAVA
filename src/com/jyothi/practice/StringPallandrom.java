package com.jyothi.practice;

public class StringPallandrom {
	private void stringPallandrom() {
		String s = "MadaM";
		String rev="";
		for(int i=0;i<=s.length()-1;i++) {
			rev=s.charAt(i)+rev;
		}
		if(s.equals(rev)) {
			System.out.println("palandrome");
		}
		else {
			System.out.println("not pallandrome");
		}
	}
	public static void main(String[] args) {
		StringPallandrom obj = new StringPallandrom();
		obj.stringPallandrom();
	}

}
