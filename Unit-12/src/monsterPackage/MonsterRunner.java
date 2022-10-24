package monsterPackage;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st Monster's Name :: ");
		String name = keyboard.next();
		System.out.println("Enter 1st Monster's Size :: ");
		int size = keyboard.nextInt();
		
		//instantiate monster one
		Monster monsterOne = new Skeleton(name, size);
		
		//ask for name and size
		System.out.println("Enter 2nd Monster's Name :: ");
		name = keyboard.next();
		System.out.println("Enter 2nd Monster's Size :: ");
		size = keyboard.nextInt();

		
		//instantiate monster two
		Monster monsterTwo = new Skeleton(name, size);
		
		System.out.println("\nMonster 1 - " + monsterOne);
		System.out.println("\nMonster 2 - " + monsterTwo);
		
		
		
		String finalString = "";
		if(monsterOne.isBigger(monsterTwo)){
			finalString += "\n\nMonster one is bigger than monster two";
		}
		else{
			finalString += "\n\nMonster one is not bigger than monster two";
		}
		if(monsterOne.isSmaller(monsterTwo)){
			finalString += "\nMonster one is smaller than monster two";
		}
		else{
			finalString += "\nMonster one is not smaller than monster two";
		}
		if(monsterOne.namesTheSame(monsterTwo)){
			finalString += "\nMonster one has the same name as Monster two.";
		}
		else {
			finalString += "\nMonster one does not have the same name as Monster two.";
		}
		System.out.println(finalString);


	}
}
