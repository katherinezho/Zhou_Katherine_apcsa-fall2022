//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
	    int count = 0;
	    m = new String[size][size];
	    for(int outer = 0; outer<size; outer++){
		    for(int inner = 0; inner<size; inner++){
			    m[outer][inner] = str.substring(count,count++);
			    count++;
		    }
	    }
    }

    public boolean isFound( String word )
    {
    	for(int i = 0; i < m.length; i++){
		for(int x = 0; x < m.length; x++){
			if(m[i][x].equals(word.substring(0,1)){
				if(checkRight(word, i, x) || checkLeft(word, i, x) || checkUp(word, i, x) || checkDown(word, i, x)){
					return true;
				}
			}
		}
	}
	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
	   	boolean returnVal = false;
		for(int i = 1; i < w.length; i++){
			if((c+i)< m.length){
				if(!(m[r][c+i].equals(w.substring(i,i++))
			    	 return false;
			 }
			else
				return false;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		for(int i = 1; i < w.length; i++){
			if((c-i)>=0){
				if(!(m[r][c-i].equals(w.substring(i,i++))
			    	 return false;
			 }
			else
				return false;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		for(int i = 1; i < w.length; i++){
			if((r-i)>=0){
				if(!(m[r-i][c].equals(w.substring(i,i++))
			    	 return false;
			 }
			else
				return false;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   for(int i = 1; i < w.length; i++){
			if((c+i)<m.length){
				if(!(m[r][c+i].equals(w.substring(i,i++))
			    	 return false;
			 }
			else
				return false;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		for(int i = 1; i < w.length; i++){
			if((c+i)<m.length && (r-i)>=0){
				if(!(m[r-i][c+i].equals(w.substring(i,i++))
			    	 return false;
			 }
			else
				return false;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		for(int i = 1; i < w.length; i++){
			if((c-i)>=0 && (r-i)>=0){
				if(!(m[r-i][c-i].equals(w.substring(i,i++))
			    	 return false;
			 }
			else
				return false;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		for(int i = 1; i < w.length; i++){
			if((c-i)>=0 && (r+i)<m.length){
				if(!(m[r+i][c-i].equals(w.substring(i,i++))
			    	 return false;
			 }
			else
				return false;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		  for(int i = 1; i < w.length; i++){
			if((c+i)<m.length && (r+i)<m.length){
				if(!(m[r+i][c+i].equals(w.substring(i,i++))
			    	 return false;
			 }
			else
				return false;
		}
		return true;
	}

    public String toString()
    {
 		return Arrays.toString(m);
    }
}
