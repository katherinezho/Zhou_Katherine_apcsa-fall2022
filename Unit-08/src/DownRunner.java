//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{	
		RayDown ray = new RayDown();
		System.out.println(ray.go(new int[] {5, 4, 3, 2, 1}));
		System.out.println(ray.go(new int[] {5, 4, 3, 2, 3}));
	}
}
