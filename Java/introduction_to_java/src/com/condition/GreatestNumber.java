package com.condition;

import java.util.Scanner;

public class GreatestNumber {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter three numbers:");
	        System.out.print("Number 1: ");
	        int num1 = sc.nextInt();
	        System.out.print("Number 2: ");
	        int num2 = sc.nextInt();
	        System.out.print("Number 3: ");
	        int num3 = sc.nextInt();
	        sc.close();

	        int greatest;
	        if (num1 >= num2 && num1 >= num3) {
	            greatest = num1;
	        } 
	        else if (num2 >= num1 && num2 >= num3) {
	            greatest = num2;
	        } 
	        else {
	            greatest = num3;
	        }
	        System.out.println("The greatest number is: " + greatest);
	  }
}
