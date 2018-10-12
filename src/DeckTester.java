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
		
		//Deck 1
		System.out.println("=====Deck 1 test=====");
		String[] Ranks1= {"ace","two","three","jack","Queen"};
		String[] suits1= {"red","yellow","green"};
		int[] points1 = {1,2,3,11,12};
		Deck one =new Deck(Ranks1,suits1,points1);
		System.out.println("Deck 1 size: "+one.size());
		System.out.println("Deck 1 isEmpty: "+one.isEmpty());
		System.out.println(one);
		
		//Deck 2
		System.out.println("=====Deck 2 test=====");
		String[] Ranks2= {"ace ","two ","three ","four ","five ","six ","seven ",
				"eight ","nine ","ten ","jack ","Queen ","King "};
		String[] suits2= {" heart"," spade"," dimond"," club"};
		int[] points2 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck two =new Deck(Ranks2,suits2,points2);
		System.out.println("Deck 2 size: "+two.size());
		System.out.println("Deck 2 isEmpty: "+two.isEmpty());
		System.out.println(two);
		
		//Deck 3
		System.out.println("=====Deck 3 test=====");
		Deck three =new Deck(Ranks2,suits2,points2);
		System.out.println("Deck 3 isEmpty: "+three.isEmpty());
		System.out.println("===DEALING CARDS===");
		while(!three.isEmpty()) {
			System.out.println(three.deal());
		}
		System.out.println("Deck 3 isEmpty: "+three.isEmpty());
				
	}
}