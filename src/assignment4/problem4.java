/*Write a method to check leap year*/
package assignment4;

public class problem4 {
	
		
		// Write a method to check leap year
		
		public static void main(String[] args) {
			leapYear(2007);
		}
		
		public static void leapYear(int year){

	        boolean leap = false;
	        if(year % 4 == 0)
	        {
	            if( year % 100 == 0)
	            {
	                // year is divisible by 400, hence the year is a leap year
	                if ( year % 400 == 0)
	                    leap = true;
	                else
	                    leap = false;
	            }
	            else
	                leap = true;
	        }
	        else
	            leap = false;
	        if(leap)
	            System.out.println(year + " is a leap year.");
	        else
	            System.out.println(year + " is not a leap year.");
	    }

	}
