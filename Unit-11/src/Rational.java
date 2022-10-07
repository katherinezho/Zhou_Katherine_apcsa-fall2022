//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numberOne;
	private int numberTwo;
	private int newNum;
	private int newDen;

	//write two constructors
	public Rational() {
		
	}
	public Rational(int one, int two) {
		setRational(one, two);
	}


	//write a setRational method
	public void setRational(int one, int two) {
		numberOne = one;
		numberTwo = two;
	}
	

	//write  a set method for numerator and denominator

	
	public void add(Rational other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int numeratorOne = Integer.toString(numberOne).charAt(0);
		int numeratorTwo = Integer.toString(numberTwo).charAt(0);
		
		int denominatorOne = Integer.toString(numberOne).charAt(2);
		int denominatorTwo = Integer.toString(numberTwo).charAt(2);
		
		newNum = (numeratorOne * denominatorTwo + numeratorTwo * denominatorOne);
		newDen = (denominatorOne * denominatorTwo);
		


		reduce();
	}

	private void reduce()
	
	
	{
		int divisor = gcd(newNum, newDen);
		newNum = newNum/divisor;
		newDen = newDen/divisor;



	}

	private int gcd(int numOne, int numTwo)
	{
		int max;
		int gcd = 1;
		if(newNum>newDen)
			max = newDen;
		else
			max = newNum;
			
		for(int i = 0; i <max; i++) {
			if(newNum%i == 0 && newDen%i ==0) {
				gcd = i;
			}
		}


		return gcd;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return newNum;
	}
	public int getDenominator() {
		return newDen;
	}
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}