package com.upskill.java_2;

public class Variables {

	String country = "USA";
	static String region = "North America";
    
    public static void main(String[] args){   
        String city = "New York";
        System.out.println(city);
        Variables obj = new Variables();
        System.out.println(obj.country);
        System.out.println(region);
        
        obj.CT("Hartford County");
        obj.NJ("Middlesex County");
    }
    
	public void NJ(String county){
		
		String myCounty = county;
		System.out.println(myCounty);
		
	    String city = "Edison";
		System.out.println(city);
		
		Variables obj = new Variables();
		System.out.println(obj.country);
		System.out.println(region);
	}

	public void CT(String county){
		
		String myCounty = county;
		System.out.println(myCounty);
		
		String city = "Hartford";
	    System.out.println(city);	    
	    
	    Variables obj = new Variables();
	    System.out.println(obj.country);
	    System.out.println(region);

	}
}