package com.array;

public class ExampleTest extends Exception {
	
	public void method1() throws ArithmeticException
	{
		throw new ArithmeticException();
	}


	public static void main(String[] args) {
		ExampleTest et = new ExampleTest();
		try {
			et.method1();	
		}catch(ArithmeticException e) { System.out.println("this is good for health"); }
	}
}

