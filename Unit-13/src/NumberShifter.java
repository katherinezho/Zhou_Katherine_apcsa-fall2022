//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	private int[] sevenArray;
	public static int[] makeLucky7Array( int size)
	{
		sevenArray = new int[size];
		for(int i = 0; i < size; i++) {
			sevenArray[i] = (int)(Math.random() * 9) + 1;
		}
		return sevenArray;
	}
	public static void shiftEm(int[] array)
	{
		int count = 0;
		for (int i = 0; i< array.length;i++) {
			if(array[i] == 7) {
				array[i] = array[count];
				array[count++] = 7;
				count++;
			}
		}
		
	}
	public static int[] returnArray(){
		return sevenArray;
	}
}
