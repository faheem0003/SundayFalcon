/* Problem5. Write a program in Java to display the multiplication table of (eight)8.*/
package assignment2;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod();
		}

		public static void myMethod() {
		
			for (int row = 1; row <= 8; row++) {
				for (int col = 1; col <= 8; col++) {
					int MultiplicationTable = row * col;
					System.out.print(MultiplicationTable + " ");
				}
				System.out.println("");
			}

	}

}
