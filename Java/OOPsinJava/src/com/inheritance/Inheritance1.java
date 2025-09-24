package com.inheritance;

class Animal {
	public void eat() {
		System.out.println("Animal Eating");
	}
}

class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog is Eating");
	}
	public void IsWalking() {
		System.out.println("Dog is Walking");
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();
		d1.IsWalking();
	}
}
