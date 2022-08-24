//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
    //variables and instantiate
    int x1, y1, x2, y2;
    Scanner keyboard = new Scanner(System.in);
    //get values
    System.out.println("Enter X1 :: ");
    x1 = keyboard.nextInt();
    System.out.println("Enter Y1 :: ");
    y1 = keyboard.nextInt();
    System.out.println("Enter X2 :: ");
    x2 = keyboard.nextInt();
    System.out.println("Enter Y2 :: ");
    y2 = keyboard.nextInt();

    //Instantiate
    Distance distance = new Distance();
    //call methods
    distance.setCoordinates(x1, y1, x2, y2);
    distance.calcDistance();
    System.out.println("distance == " + distance.getDistance());
    

	}
}
