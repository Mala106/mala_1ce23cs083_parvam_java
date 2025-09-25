package com.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndex {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array: " +Arrays.toString(arr));
		try {
			System.out.println("5th: " +arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		System.out.println("Program completed");	
	}
}
