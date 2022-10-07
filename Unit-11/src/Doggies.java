//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	private int packSize;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		packSize = size;
		pups = new Dog[packSize];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		if(spot<packSize) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		String oldest = pups[0].getName();
		int age = 0;
		for(Dog x : pups) {
			if(x.getAge() > age) {
				age = x.getAge();
				oldest = x.getName();
			}
				
			
		}
		return oldest;
	}

	public String getNameOfYoungest()
	{
		String youngest = pups[0].getName();
		int age = 10000000;
		for(Dog y : pups) {
			if(y.getAge() < age) {
				age = y.getAge();
				youngest = y.getName();
			}
				
			
		}
		return youngest;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}