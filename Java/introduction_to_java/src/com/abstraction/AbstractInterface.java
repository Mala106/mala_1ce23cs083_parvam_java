package com.abstraction;

class Car implements Vehicle{

  @Override
public void start() {
	// TODO Auto-generated method stub
	System.out.println("car class start method");
}

@Override
public void stop() {
	// TODO Auto-generated method stub
	System.out.println("Car class stop method");
}
}
public class AbstractInterface {
    public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.stop();
		Vehicle.display();
	}
}


