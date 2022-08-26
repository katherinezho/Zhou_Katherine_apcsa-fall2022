//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("6 is odd :: " + NumberVerify.isOdd(6));
		System.out.println("6 is even :: " + NumberVerify.isEven(6));
		
		//add in more test cases
		System.out.println("9 is odd :: " + NumberVerify.isOdd(9));
		System.out.println("9 is even :: " + NumberVerify.isEven(9));
		
		System.out.println("10223 is odd :: " + NumberVerify.isOdd(10223));
		System.out.println("10223 is even :: " + NumberVerify.isEven(10223));
		
		
	}
}