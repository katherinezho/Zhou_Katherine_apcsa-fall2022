//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static boolean go(int[] ray)
	{
		
		int difference = 0;
		for(int i = 0; i < ray.length; i++){
			if(ray[i]%2 ==1){
				for(int j = i; j < ray.length; j++){
					if(ray[j]%2==0)
						difference = j - i;
					else
						difference = difference;
					
				}
			}
			
		}
		if(difference == 0)
			return -1;
		else
			return difference;
	}
}
