package com.company;

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/** ACTIVITY 1
         * Card a = new Card("2", "Spades", 2);
         * Card b = new Card("3", "Spades", 3);
         * Card c = new Card("2", "Spades", 2);
         * System.out.println(a.matches(b));
         * System.out.println(a.matches(c));
         * System.out.println(a.rank());
         */
        //ACTIVITY 2
        int e[] = {2, 1, 6};
        String f[] = {"A", "B", "C"};
        String g[] = {"Giraffes", "Lions"};
        Deck d = new Deck(f, g, e);
    }
}
