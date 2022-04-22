package week1.day1;

public class PositiveToNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pseudocode:
----------
 1. Initialize a number, say, int number= 35;
 2. If a number is positive, print "The number is positive"
    If a number is negative, print "The number is negative"
    If it nether negative nor positive, print as "The number is neither positive nor negative"
    */
		
		int number=-15;
		
		if(number>0)
		{
			System.out.println("number is positive");
		}
		
		else if (number<0)
		{
			System.out.println("number is negative");
		}
		else {
			System.err.println("the number is neither positive nor negative");
		}
	}

}
