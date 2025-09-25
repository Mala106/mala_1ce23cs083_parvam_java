package com.datatypes;

import java.util.Scanner;

public class EmployeeDetails {

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("--- Enter Employee Details ---");
	        System.out.print("Enter Employee ID: ");
	        int employeeId = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Department: ");
	        String department = scanner.nextLine();

	        System.out.print("Enter Salary: ");
	        double salary = scanner.nextDouble();
	        
	        scanner.close();

	        System.out.println("\n--- Employee Details ---");
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: $" + String.format("%.2f", salary));
	    }
	}
