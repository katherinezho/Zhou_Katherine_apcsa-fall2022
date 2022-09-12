//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Enter Letter :: ");
	   char letter = keyboard.next().charAt(0);
	   System.out.println("Enter Number :: ");
	   int number = keyboard.nextInt();
	   TriangleFive five = new TriangleFive(letter, number);
	   System.out.println(five);
   }
}