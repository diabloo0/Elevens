/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		//card 1
		System.out.println("=====Card 1 test=====");
		Card one=new Card("ace","spades",1);
		System.out.println("card 1 suit: "+one.suit());
		System.out.println("card 1 rank: "+one.rank());
		System.out.println("card 1 point: "+one.pointValue());
		//card 2
		System.out.println("=====Card 2 test=====");
		Card two=new Card("ace","spades",1);
		System.out.println("card 2 suit: "+two.suit());
		System.out.println("card 2 rank: "+two.rank());
		System.out.println("card 2 point: "+two.pointValue());
		System.out.println("card 1 matchs card 2: "+ one.matches(two));
		//card 3
		System.out.println("=====Card 3 test=====");
		Card three=new Card("Jack","hearts",11);
		System.out.println("card 3 suit: "+three.suit());
		System.out.println("card 3 rank: "+three.rank());
		System.out.println("card 3 point: "+three.pointValue());
		System.out.println("card 1 matches card 3: " +one.matches(three));
	}
}
