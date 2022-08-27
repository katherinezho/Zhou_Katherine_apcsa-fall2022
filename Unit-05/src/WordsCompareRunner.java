//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   Scanner keyboard = new Scanner(System.in);
	   System.out.print.ln("Enter Word One :: ");
	   
	   String one = keyboard.next();
	   
	   System.out.print.ln("Enter Word Two :: ");
	   
	   String two = keyboard.next();
	   
	   WordsCompare compare = new WordsCompare(one, two);
	   
	   System.out.println(compare);
	   
	   

	}
}
