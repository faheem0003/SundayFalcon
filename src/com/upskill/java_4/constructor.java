package com.upskill.java_4;

public class constructor {
	
	String studentName;
	int studentAge;

	public constructor(String name, int age){
		studentName = name;
		studentAge = age;
	}
	public constructor(String name){
		studentName = name;
	}
	public constructor(int age){
		studentAge = age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		constructor obj1 = new constructor("fariyan",25);
		System.out.println(obj1.studentName);
		System.out.println(obj1.studentAge);
		
		constructor obj2 = new constructor("nahiyan");
		System.out.println(obj2.studentName);
		
		constructor obj3 = new constructor(26);
		System.out.println(obj3.studentAge);
	}

}
