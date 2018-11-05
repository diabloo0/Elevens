import java.util.ArrayList;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 4;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("SHUFFFLE NAMES");
		ArrayList<String> names= new ArrayList<String>();
		names.add("Sophia");
		names.add("Jeff");
		names.add("Alex");
		names.add("Aaron");
		names.add("Tim");
		names.add("Michael");
		names.add("Angela");
	}

	public static void wordShuffle(ArrayList<String>names) {
		for(int k=names.size()-1;k>0;k--) {
			int pos=(int)(Math.random()*(k));			
			String temp=names.get(pos);					
			names.set(pos,names.get(k));
			names.set(k,temp);
		}
	}

	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		//multi-loop counter
		int k=0;
		int[] temp =new int[values.length];
		//not the midpoint of the array
		int mid =values.length/2;
		//counter to help us space out this shuffle
		int spacer =0;
		//loop through the first half
		for(;k<mid;k++) {
			temp[spacer]=values[k];
			spacer +=2;
		}
		//after this loop
		spacer=1;
		//loop through the second half
		for(;k<values.length;k++) {
			temp[spacer]=values[k];
			spacer +=2;
		}
		//copy the value back to the original array
		for(int x=0;x<values.length;x++) {
			values[x]=temp[x];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		for(int k=values.length-1;k>0;k--) {
			int pos=(int)(Math.random()*(k+1));
			//copy from position to temp
			int temp=values[pos];		
			//copy from k to position
			values[pos]=values[k];
			//copy from temp to k
			values[k]=temp;
		}
	}
}