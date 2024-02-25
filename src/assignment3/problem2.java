/* Problem 2.	Write a java program which will display 5 employee information (name, age, salary and address). */
package assignment3;

public class problem2 {
			static int count=1;
			problem2(String name,int age,int salary,String address){
				System.out.println("Employee Number: "+count);
				System.out.println("Employee Name: "+name);
				System.out.println("Employee Age: "+age);
				System.out.println("Employee Salary: "+salary);
				System.out.println("Employee Address: "+address);
				count++;
				System.out.println("");
			}

			public static void main(String[] args) {
				problem2[] obj=new problem2[5];
				obj[0]=new problem2("Shohid",37,190000,"Flushing");
				obj[1]=new problem2("Rasel",26,170000,"New Jersey");
				obj[2]=new problem2("Juel",33,100000,"Jamaica");
				obj[3]=new problem2("Jahangir",28,160000,"Jackson Heights");
				obj[4]=new problem2("Zain",5,150000,"Jamaica");
			}
}
