package wordPackage;
//(c) A+ Computer Science
//www.apluscompsci.com
import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/wordPackage/words.dat"));

		int size = file.nextInt();
		Word[] test = new Word[size];
		for(int x = 0; x < size; x++) {
			test[x] = new Word(file.next());
			file.nextLine();
		}
		//System.out.println(test[9]);
		Word temp;
		for(int v = 0; v <= 9; v++) {
			for(int i = 9; i >= v; i++) {
				if((test[v].compareTo(test[i]))>0) {
					temp = test[v];
					test[v] = test[i];
					test[i] = temp;
				}
			}
		}
		
	
	}
}

