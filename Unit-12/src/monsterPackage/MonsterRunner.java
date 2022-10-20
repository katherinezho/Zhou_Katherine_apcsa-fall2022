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
		Skeleton monsterOne = new Skeleton(name, size);
		
		//ask for name and size
		System.out.println("Enter 2nd Monster's Name :: ");
		System.out.println("Enter 2nd Monster's Size :: ");

		
		//instantiate monster two
		Skeleton monsterTwo = new Skeleton(name, size);
		
		System.out.println("/nMonster 1 - " + monsterOne.getName() + " " + monsterOne.getSize());
		System.out.println("/nMonster 1 - " + monsterOne.getName() + " " + monsterOne.getSize());
		
		System.out.println(monsterOne);


	}
}
