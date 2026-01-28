package com.ibm.exceptions;

public class Application
{
	public static void main( String[] args ) {
	try{
		System.out.println(Integer.parseInt(args[0])/ Integer.parseInt(args[1]));
	}catch(ArrayIndexOutOfBoundsException exception) {
		System.out.println("you need to provide 2 numbers");
	}catch(ArithmeticException exception) {
		System.out.println("you can't divide by zero");
	}catch(Exception exception) {
		System.out.println("unknown exception");
	}
	System.out.println("The End");
}
}