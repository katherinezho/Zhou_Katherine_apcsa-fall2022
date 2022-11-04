//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		for(int count = 0; count < number && (number / (int)(Math.pow(10, count)) != 0); count++) {
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int num = number;
		int temp = 0;
		
		for(int i = 0; i < sorted.length; i++){
			sorted[i] = num%10;
			num = num/10;
		}
		
		
		for(int i = 1; i < sorted.length; i++) {
			if(sorted[i]<sorted[i-1]){
				temp = sorted[i];
				sorted[i] = sorted[i-1];
				sorted[i-1] = temp;
			}
		}
		
		
		return sorted;
	}
}
