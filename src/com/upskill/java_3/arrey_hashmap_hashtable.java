package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class arrey_hashmap_hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 30;
		int[] ageFalcon = new int[]{25, 30, 22, 28, 35};
		
		//array index               [0],[1],[2],[3],[4]
		
		System.out.println("student age:" + ageFalcon[3]);
		System.out.println("total student:" + ageFalcon.length);
		
		String[] nameFalcon = new String[] {"x","y","z","q","w"};
		System.out.println("student name:" +nameFalcon[2]);
		System.out.println("total student:" +nameFalcon.length);
	
		boolean[] booleanFalcon = new boolean[]{true,false,false,true,false};
		System.out.println("student attendance:" +booleanFalcon[3]);
		System.out.println("total student:" + booleanFalcon.length);
		
		int[][] ageFalcon2D = {{25, 30, 22, 28, 35},
				               {23, 26, 43, 33, 31}};
		System.out.println("student age 2d: " +ageFalcon2D[0][3]);
		
		
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
		
		StudentAge.put("x", 33);
		StudentAge.put("y", 22);
		StudentAge.put("r", 24);
		StudentAge.put("t", 26);
		StudentAge.put("s", 32);
		
		System.out.println("HashMap Student Age:" + StudentAge.get("r"));		
		
		
        HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("x", "xx");
		Capital.put("y", "yy");
		Capital.put("z", "zz");
		Capital.put("w", "ww");
		Capital.put("q", "qq");
		
		System.out.println("Capital:" + Capital.get("w"));
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BB", "b");
		Region.put("CC", "c");
		System.out.println("Hashtable Region:" + Region.get("CC"));
		
		HashSet<String> car= new HashSet<>();
		car.add("bmw");
		car.add("audi");
		car.add("toyota");
		car.add("buick");
		System.out.println("car:" + car);

		
	}
}
