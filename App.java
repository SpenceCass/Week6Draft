package javaFinalProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to War!");
		
		System.out.println("\n" + "Let's start the game. Here's the deck and the player names");
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		player1.name = "Jerry";
		player2.name = "Samantha";
		player1.describe();
		player2.describe();
		
		deck.shuffle();
		Card drawnCard = deck.draw();
		drawnCard.describe();
		
		
	}

}
