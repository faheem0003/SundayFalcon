package com.upskill.java_2;

public class loops {

	public static void main(String[] args) {
		
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedForLoop();
	}
   public static void practiceForLoop(){
	   int i;
	   for(i=5; i>=1; i--){
		   System.out.println(i);
	   }
   }
   
   public static void practiceWhileLoop(){
    int i=1;
    while(i<=5){
    	System.out.println("while loops number = "+i);
    	i++;
    }
   }
    
    public static void practiceDoWhileLoop(){
    	int i=1;
    	do {
    	System.out.println("do while loops number=" +i);
    	i++;
    } while(i<=0);
 }
    public static void practiceInfiniteLoop(){
    	int i;
    	for (i=1; ;i++){
    		System.out.println("inf loop numbers =" +i);
    	}
    }
    public static void practiceNestedForLoop(){
    	int i;
    	int j;
    	for (i=1; i<=5; i++){
    	for (j=1; j<=5; j++){
    		int multiplicationTable = i*j;
    		System.out.print(multiplicationTable + " ");
    	}
    		System.out.println(" ");
	}
    	
    }
    
}

