package activity1;
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card testOne = new Card("ace", "hearts", 13);
		Card testTwo = new Card("two", "spades", 1);
		Card testThree = new Card("two", "spades", 1);
		
		System.out.println(testOne.suit());
		System.out.println(testOne.rank());
		System.out.println(testOne.pointValue());
		System.out.println(testOne.matches(testTwo));
		System.out.println(testOne + "\n");
		
		System.out.println(testTwo.suit());
		System.out.println(testTwo.rank());
		System.out.println(testTwo.pointValue());
		System.out.println(testTwo.matches(testThree));
		System.out.println(testTwo + "\n");
		
		System.out.println(testThree.suit());
		System.out.println(testThree.rank());
		System.out.println(testThree.pointValue());
		System.out.println(testThree.matches(testThree));
		System.out.println(testThree + "\n");
		
		
		
	}
}
