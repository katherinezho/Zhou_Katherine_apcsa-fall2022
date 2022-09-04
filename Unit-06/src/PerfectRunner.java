//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Number :: ");
		int num = keyboard.nextInt();
		
		
		Perfect perfectNumber = new Perfect(num);
		System.out.println(perfectNumber);

		
																
	}
}
