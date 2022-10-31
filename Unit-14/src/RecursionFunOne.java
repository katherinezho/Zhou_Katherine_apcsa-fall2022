//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{

		if(number == 0){
			return 0;
		} 
		if(number%2 == 1)
			return 1 + countOddDigits(number/10);
		else
			return 0 + countOddDigits(number/10);

	}
}
