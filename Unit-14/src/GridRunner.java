//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] testString = {"5", "7", "x", "q", "d"};
			
		Grid test = new Grid(5, 5, testString);
		System.out.println(test);
	}
}