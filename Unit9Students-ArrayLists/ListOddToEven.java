//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static boolean go( List<Integer> ray )
	{
		int countEven = 0;
		int countOdd = 0;
		boolean foundEven = false;
		boolean foundOdd = false;
		for (int i = 0; i < ray.size() && !(foundOdd && foundEven); i++) {
			if(!foundOdd && ray.get(i) %  2 == 1) {
				countOdd = (i);
				foundOdd = true;
			}
			if(!foundE && ray.get(ray.size()-1-i) %  2 == 0) {
				countEven = ray.size()-i;
				foundEven = true;
			}
		}
		if (foundOdd) {
			return (countO - countE);
		}
		else {
			return -1;
		}
	}
}
