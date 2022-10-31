//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;
	private String[] arrayValues;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		arrayValues = vals;
		grid = new String[rows][cols];
		for(int outer = 0; outer < grid.length; outer++){
			for(int inner = 0; inner < grid[outer].length; inner++){
				grid[outer][inner] = vals[math.random() * vals.length];		
			}
		}

		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int maxCount = 0;
		String maxCountValue = "";
		for(int x = 0; x < vals.length; x++){
			for(int outer = 0; outer < grid.length; outer++){
				for(int inner = 0; inner < grid[outer].length; inner++){
					if(grid[inner][outer].equals(vals[x])){
						count++;
					}
			
				}
			}
			if(count > maxCountValue){
			maxCount = count;
			maxCountValue = vals[x];
		}
		count = 0;
	}
	return maxCountValue;

		
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		
		int count = 0;
		for(int outer = 0; outer < grid.length; outer++){
			for(int inner = 0; inner < grid[outer].length; inner++){
				if(grid[inner][outer].equals(val)){
					count++;
				}
			
			}
		}
		
	return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int i = 0; i < arrayValues.length; i++){
			output += "" + arrayValues[i] + “ count is ” + countVals(arrayValues[i]) + “\n”;
		}
		output += findMax(arrayValues) + “ occurs the most”;
		return output;
	}
}
