//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);


	}

	public void setNum(int num)
	{
		number = num;

	}
	public String triple(){
		String finalString = "";
		for(int a = 1; a < number; a++){
			for(int b = 1; b < number; b++){
				for(int c = 1; c < number; c++){
					if ( ((a*a) + (b*b)) == (c*c)){
						if(c%2 == 1){
							if((a%2 == 0 && b%2 == 1) || (a%2 == 1 && b%2 == 0)){
								if(greatestCommonFactor(a, b, c) == 1){
									finalString += a + " " + b + " " + c + "\n";
								}
							}
						}
					}
				}
			}
		}
		return finalString;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		for(int x = 1; x < a; x++){
			if(a%x == 0 && b%x == 0 && c%x == 0)
				max = x;
		}
		return max;



		
		
		
	}

	public String toString()
	{
		String output="";






		return triple();
	}
}
