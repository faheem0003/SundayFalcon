package com.upskill.java_2;

public class methodType extends Variables {
	

	public static int hourlyIncome = 65;

	public static void main(String[] agrs){
	
    methodType obj = new methodType();
	obj.annualIncomeVoid();
	
	System.out.println("My Monthly Income =" + obj.monthlyIncomeReturn());
	weeklyIncomeStatic();
	
	}
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome*2000;
		System.out.println("my annual income ="+ calculateAnnualIncome);
	}
	
	public int monthlyIncomeReturn(){
		int calculateMonthlylIncome = hourlyIncome*200;
		return calculateMonthlylIncome;
	}
	
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome*40;
		System.out.println("my weekly income ="+ calculateWeeklyIncome);


	}
}
