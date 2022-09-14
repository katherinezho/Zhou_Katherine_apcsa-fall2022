//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static boolean go(int[] ray)
	{
		int odd;
		int even;
		int difference = 0;
		for(int i = 0; i < ray.length; i++){
			if(ray[i]%2 ==1){
				odd = i;
				for(int j = i; j < ray.length; j++){
					if(ray[j]%2=0){
						even = j;
						difference = even - odd;
					}
				}
			}
			
		}
		if(difference == 0)
			return -1;
		return difference;
	}
}
