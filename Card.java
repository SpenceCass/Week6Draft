package javaFinalProject;

public class Card {
	
	//fields
	int value;
	String name;
	String suit;
	
	//methods
	public Card() {}
	
	public Card(String name, String suit, int value) {
		value = this.value;
		name = this.name;
		suit = this.suit;
	}
	
	
	//describe method
	public void describe()  {
		System.out.println("This is the " + name + " of " + suit + ". " + "It's value is " + value + ".");
				}
	
	//getters and setters
	
	//getter
	public String getSuit() {
		return suit;
	}
	
	//setter
	public void setSuit(String newSuit) {
		this.suit = newSuit;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String newName) {
		this.name = newName;
	}
	
	
	//getter
	public int getValue() {
		return value;
	}
	
	
	//setter
	public void setValue(int newValue) {
		this.value = newValue;
	}
	
	
}
