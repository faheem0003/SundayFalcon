/* Problem 4.	Write a java program that explains runtime polymorphism. */

package assignment3;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem4 v1=new problem4();
		v1.wheels();
		System.out.println("Run-Time PolyMorphism ->");
		problem4 v2=new Truck();
		v2.wheels();
		problem4 v3=new Car();
		v3.wheels();
		problem4 v4=new Bike();
		v4.wheels();
		problem4 v5=new BiCycle(); //BiCycle doesn't have wheel class so its upper class method is invoked!
		v5.wheels();
	}
	
	void wheels(){
		System.out.println("Every Vehicle have some wheels!");
	}
}

class Truck extends problem4{
	void wheels(){
		System.out.println("Trucks have 6 wheels!");
	}
}

class Car extends problem4{
	void wheels(){
		System.out.println("Cars have 4 wheels!");
	}
}

class Bike extends problem4{
	void wheels(){
		System.out.println("Bikes have 2 wheels!");
	}
}

class BiCycle extends Bike{
	}