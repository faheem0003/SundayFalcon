package com.upskill.java_6;

public class Singleton {
	
	private Singleton(){
		
	}
	
	private static Singleton SingletonObJ = new Singleton();
	
	public static Singleton getInstence(){
		return SingletonObJ;
		}
	protected static void demo(){
		System.out.println("demo method for singleton class");
	}
}

