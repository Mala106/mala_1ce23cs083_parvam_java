package com.class_objects;

class Car {
	String brand;
	int year;
	
	public void display() {
		System.out.println("Brand: "+brand);
		System.out.println("Year: "+year);
	}
}
public class ClassObjects {
	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.brand = "Tesla";
		obj1.year = 2000;
		obj1.display();
		
		Car obj2 = new Car();
		obj2.brand = "Ferrari";
		obj2.year = 2007;
		obj2.display();
	}
}
