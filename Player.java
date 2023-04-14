package javaFinalProject;

import java.util.List;
import java.util.ArrayList;

public class Player {

	//fields
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	//methods
	public void describe() {
		System.out.println("This is " + name + " the cards in his/her deck are:");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	//flip top card
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	
	//return to deck
	
	
}
