package com.abstraction;

	abstract class Shape{
		abstract void draw();
		public void display() {
			System.out.println("This is display function");
		}
	}
	class Circle extends Shape{
		@Override
		void draw() {
			System.out.println("This is shape draw method");
		}
	}

	public class AbstractClass { 
		public static void main(String[] args) {
			Circle circle = new Circle();
			circle.draw();
			circle.display();
		}

	}
