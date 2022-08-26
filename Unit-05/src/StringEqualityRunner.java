//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 
import java.util.Scanner;
import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//Instantiate Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		//Collect String One
		System.out.println("Enter String One :: ");
		String one = keyboard.next();
		
		//Collect String Two
		System.out.println("Enter String Two :: ");
		String two = keyboard.next();
		
		
		StringEquality stringCheck = new StringEquality( one,  two);
		
		System.out.println(stringCheck);
		
	}
}