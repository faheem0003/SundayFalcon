package com.upskill.java_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main
		{
		    public static void main(String[] args) {
		    	String[] array = { "Apple",   "Cat",    "Ball",
	                     "Cartoon", "Banana", "Avocado" };
	    Arrays.sort(array);
        for (String i : array) {
	    System.out.print(i + " ");
	    
        }   
	  HashMap<String,Boolean> attendance = new HashMap<String,Boolean>();
	  attendance.put("x", true);
	  attendance.put("t", true);  
	  attendance.put("f", false);  
	  attendance.put("y", false);
	   System.out.println(attendance.get("f"));
		    
	   HashSet<Integer> id= new HashSet<>();
		id.add(13413);
		id.add(31411);
		id.add(43213);
		id.add(34423);
		id.add(44565);
		System.out.println("id:" + id);
	  
        
		    }
		    }
