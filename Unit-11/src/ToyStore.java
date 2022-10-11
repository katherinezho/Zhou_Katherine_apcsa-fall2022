//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		this("");
	}
	
	public ToyStore(String toys)
	{
		toyList = new ArrayList<Toy>();
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
		if (toys == "")
			return;
		for (String name : toys.split(" ")) {
			Toy t = getThatToy(name);
			if (t == null)
				toyList.add(new Toy(name));
			else
				t.setCount(t.getCount()+1);
		}
			
	
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy x: toyList) {
  			if(x.getName().equals(nm))
  				return x;
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy max = new Toy();
  		max.setCount(0);
  		for (Toy t: toyList) {
  			if (t.getCount() > max.getCount())
  				max = t;
  		}
  		return max.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		boolean sorted = false;
  		while (!sorted) {
  			sorted = true;
	  		for(int i = 0; i < toyList.size()-1; i++) {
	  			Toy t = toyList.get(i);
	  			Toy tp = toyList.get(i+1);
	  			if(t.getCount() < tp.getCount()) {
	  				sorted = false;
	  				Toy temp = t;
	  				toyList.set(i, tp);
	  				toyList.set(i + 1, temp);
	  			}
	  		}
  		}
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}
