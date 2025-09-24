package com.functions;

public class FunctionsInJava {
		public int add (int num1, int  num2) { //parameters
			return num1+num2;
	}
	public static void main(String[] args) {
		// syntax: className obj_name = new className();
		FunctionsInJava obj1 = new FunctionsInJava();
		int res = obj1.add(10, 20);  //arguments
		System.out.println("res: "+res);
		int res1 = obj1.add(100, 200);
		System.out.println("res1: "+res1);
	}
}
