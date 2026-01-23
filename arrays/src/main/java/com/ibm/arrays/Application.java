package com.ibm.arrays;

class Test{
	static int value;
	Test(){
		System.out.println("constructor called");
	}
	static {
		System.out.println("static Intializer called");
	}
	{
		System.out.println("Inline block called");
	}
	
}
public class Application
{
	public static void main( String[] args )
	{
		new Test();
		
		
		}
	}
