//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases
		
		BiggestDouble yay = new BiggestDouble(488.1,93.4,-1.2,23.4);
		System.out.println(yay);
		System.out.println("biggest = " + yay.getBiggest() + "\n");
		
		BiggestDouble three = new BiggestDouble(4.9,-6.7,71992.1,9.5);
		System.out.println(three);
		System.out.println("biggest = " + three.getBiggest() + "\n");
				
	}
}