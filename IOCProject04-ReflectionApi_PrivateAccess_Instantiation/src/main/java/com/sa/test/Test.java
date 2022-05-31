package com.sa.test;

public class Test {
	
	private int a;
	private int b;
	
	private Test() {
		System.out.println("Test::0-Param constructor");
	}
	
	private Test(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Test::2-Param Constructor");
	}

}
