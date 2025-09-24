package com.condition;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a number: ");
		x = sc.nextInt();
		
		if(x==0) {
			System.out.println(x+ " is zero");
		}
		else if (x<0) {
			System.out.println(x+ " is -ve Number");
		}
		else if (x % 2 == 0) {
			System.out.println(x+ " is Even Number");
		} 
		else {
			System.out.println(x+ " is Odd Number");
		}
	}
}