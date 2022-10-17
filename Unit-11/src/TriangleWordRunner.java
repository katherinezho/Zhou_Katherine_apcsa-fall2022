//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
	   	char yes='y';
			do{
				out.print("\nEnter a word :: ");
				String word = keyboard.next();	
				
				//call the printWord method
	 			TriangleWord.printTriangle(word);

				System.out.print("\nDo you want to enter more sample input? ");
				yes=keyboard.next().charAt(0);			
			}while(yes == ('Y') || yes == ('y'));
		
	}
}
