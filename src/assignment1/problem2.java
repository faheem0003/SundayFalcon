/*Problem 02: A rectangle width and length are: 7 and 15 inches.
Write a method to display the parameter of rectangle in console output. */


package assignment1;

public class problem2 {
	
	public static void main(String[] args) {
		
		problem2 myObject = new problem2 ();
		myObject.myMethod2();
	}
	public void myMethod2() {
		int a = 7;
		int b = 15;
		int c = 2*(a+b);
	System.out.println("The perimeter of the rectangle with arm 7 and 15 is "+c);
		
	}


}
