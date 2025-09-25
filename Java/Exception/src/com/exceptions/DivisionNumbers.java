package com.exceptions;

import java.util.Scanner;

public class DivisionNumbers {
	public static void main(String[] args) {
		System.out.println("Program started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = 0;
		try {
			res = num1/num2;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("result is: "+res);
		System.out.println("Program Completed");
	}
}
