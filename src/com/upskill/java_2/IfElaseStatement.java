package com.upskill.java_2;

public class IfElaseStatement {

	public static void main(String[] args) {

		int age = 65;
		if(age<13){
			System.out.println("you are children");
		
		} else if (age>=13 & age<18){
			if (age>100){
			System.out.println("you are teen");

		}   
			else if (age>=65){
			System.out.println("you are senior");
		}	
			else {
				System.out.println("you are adult");
		}

		}else {
			System.out.println("you are adult");
		}
	}

}

