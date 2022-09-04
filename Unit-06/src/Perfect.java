//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
	public Perfect(){
	}
	
	public Perfect(int num){
		setPerfect(num);
	}

	//add a set method
	public void setPerfect(num){
		number = num;
	}

	public boolean isPerfect()
	{
		int total = 0;
		for(int i = 1; i < number; i++){
			if(number%i == 0)
				total = total + i;
		}
		if(total == number)
			return true;
		else
			return false;
	}

	//add a toString
	public String toString(){
		return "" + isPerfect();
	}
	
}
