package week1.day1;

public class FibonacciSeries 
{
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */
	//FibonacciSeries is 0 followed by 1, next num is sum of 1st 2 nos.
	
	public static void main(String[] args)	
	
	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

			// Print first number
			
			// Iterate from 1 to the range
			
			// add first and second number assign to sum

			// Assign second number to the first number

			// Assign sum to the second number
			
			// print sum
{
	int range=8;
	int firstnum=0;
	int secnum=1;
	int sum;
	
	System.out.println(firstnum);	
	System.out.println(secnum);
	for (int i=0; i < range; i++)
	{
		
		sum=firstnum+secnum;
		System.out.println(sum);
		firstnum=secnum;
		secnum=sum;
			
		
	}
}
	
}
