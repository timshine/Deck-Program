public class Card {
	private String suit;
	private String rank;
	private int value;

	// Overloaded Constructor
	public Card(String s, String r, int v) {
		suit = s;
		rank = r;
		value = v;
	}

	// Get Methods
	public String getSuit() {
		return suit;
	}

	public String getRank() {
		return rank;
	}

	public int getValue() {
		return value;
	}

	// Set Methods
	public void setSuit(String s) {
		suit = s;
	}

	public void setRank(String r) {
		rank = r;
	}

	public void setValue(int v) {
		value = v;
	}

	// To String Method for Card
	public String toString() {
		return "[" + suit + ", " + rank + ", " + value + "]";
	}

}
