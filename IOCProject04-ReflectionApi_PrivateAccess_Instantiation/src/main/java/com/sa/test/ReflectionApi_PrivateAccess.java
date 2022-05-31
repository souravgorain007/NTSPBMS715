package com.sa.test;

import java.lang.reflect.Constructor;

public class ReflectionApi_PrivateAccess {
	
	public static void main(String[] args) {
		
		try {
		Class c = Class.forName(args[0]);
		Constructor con[] = c.getDeclaredConstructors();
		con[0].setAccessible(true);
		Object obj1 = con[0].newInstance();
		System.out.println("obj1 :: "+obj1.toString());
		
		System.out.println("----------------------------");
		con[1].setAccessible(true);
		Object obj2 = con[1].newInstance(10,20);
		System.out.println("obj2 :: "+obj2.toString());

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
