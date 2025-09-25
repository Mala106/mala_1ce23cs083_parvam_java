package com.constructors;

class grandparent {
	//super -> right click, source, generate constructor using fields, finish
	public grandparent() {
		super();
		System.out.println("Grand parent Constructor");
	}	
}

class Person extends grandparent {
	int parent_Id = 20;
	//super -> right click, source, generate constructor using fields, finish
	public Person() {
		super();
		System.out.println("Person Constructor");
	}
}

class Student extends Person {
	public int id;
	public String name;
	public Student(int id, String name) {
//this -> right click, source, generate constructor using fields, select fields, finish
		super();
		this.id = id;
		this.name = name;
	}
//this for single field -> right click, source, generate constructor using fields, select fields(id), finish
	public Student(int id) {
		super();
		System.out.println(super.parent_Id);
		this.id = id;
	}
	
}

public class ConstructorsInJava {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Adam");
		Student s2 = new Student(101);
		System.out.println("First Student:");  
		System.out.println("Id: "+ s1.id);
		System.out.println("Name: "+ s1.name);
		
		System.out.println("Second student:");
		System.out.println("Id: " +s2.id);
		System.out.println("Name: " +s2.name);
		
	}
}
