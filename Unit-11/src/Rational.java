

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;
	//write two constructors
	public Rational() {
		this(1, 1);
	}
	public Rational(int n,int d) {
		setRational(n, d);
	}

	//write a setRational method
	public void setRational(int n, int d) {
		setNum(n);
		setDen(d);
		reduce();
	}

	//write  a set method for numerator and denominator
	public void setNum(int n) {
		num = n;
	}
	public void setDen(int d) {
		den = d;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		setNum(num * other.getDen() + other.getNum() * den);
		setDen(den * other.getDen());


		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(Math.abs(num), Math.abs(den));
		setNum(num/gcd);
		setDen(den/gcd);


	}

	private int gcd(int numOne, int numTwo)
	{
		for(int i = numOne > numTwo ? numOne: numTwo; i>0; i--) {
			if(numOne % i == 0 && numTwo % i == 0)
				return i;
		}
		return 1;
	}

	public Object clone ()
	{
		return new Rational(getNum(), getDen());
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	public boolean equals( Object obj)
	{
		if(num == ((Rational) obj).getNum() && den == ((Rational) obj).getDen()) 
			return true;
		return false;
	}

	public int compareTo(Rational other)
	{
		if (equals(other))
			return 0;
		Rational temp = new Rational(1, 1);
		temp.add(new Rational (-1 * (num+den), den));
		temp.add(other);
		if((temp.getNum() > 0 && temp.getDen() > 0 ) || (temp.getNum() < 0 && temp.getDen() < 0 )) {
			return -1;
		}
		return 1;
	}



	
	//write  toString() method
	public String toString() {
		return num + "/" + den;
	}
	
	
}
