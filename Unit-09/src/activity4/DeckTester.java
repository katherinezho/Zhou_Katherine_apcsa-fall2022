package activity4;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    String[] rankOne = {"queen", "six"};
    String[] suitOne = {"diamonds", "spades"};
    int[] pointValuesOne = {11, 5};
    Deck testOne = new Deck(rankOne, suitOne, pointValuesOne);
    System.out.println(testOne);
    testOne.shuffle();
    System.out.println(testOne);
    testOne.shuffle();
    testOne.deal();
    testOne.deal();
    System.out.println(testOne);
    
    
 /* String[] rankTwo = {"jack", "four", "eight", "king", "ace"};
    String[] suitTwo = {"hearts"};
    int[] pointValuesTwo = {10, 3, 7, 12, 13};
    Deck testTwo = new Deck(rankTwo, suitTwo, pointValuesTwo);
    System.out.println(testTwo);
    testTwo.deal();
    testTwo.deal();
    testTwo.deal();
    testTwo.deal();
    testTwo.deal();
    System.out.println(testTwo);

    
    
    String[] rankThree = {"king"};
    String[] suitThree = {"spades", "hearts", "clubs"};
    int[] pointValuesThree = {13};
    Deck testThree = new Deck(rankThree, suitThree, pointValuesThree);
    System.out.println(testThree);
    testThree.deal();

    System.out.println(testThree);

	
	*/
   
	}
}
