package org.te;

import java.util.Arrays;
import java.util.Scanner;



public class Anangaram {
	
	public static int a=10;

	private static void ana() {
		System.out.println("Enter the String1");
		String s1= new Scanner(System.in).nextLine();//dgoo
		System.out.println("Enter the String2");
		String s2=new Scanner(System.in).nextLine();//dgoo
		
		if(s1.length()==s2.length()) {
			
			char[] ca1 =s1.toCharArray();
			char[] ca2 =s2.toCharArray();
			Arrays.sort(ca1);
			Arrays.sort(ca2);
			
			boolean equals = Arrays.equals(ca1, ca2);
			if(equals==true) {
				
				System.out.println(s1+" and "+ s2+ " are anangram");
			}
			else {
				
				System.out.println(s1+" and "+ s2+ " are not anangram");
			}
			
		}
		
		else {
			
			System.out.println("String is not equal");
		}
		
		
	
	

	}
	
	public static void main(String[] args) {
		
		ana();
	}
}
