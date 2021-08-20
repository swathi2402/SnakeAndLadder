package com.Bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WIN = 100;
	public static final int START = 0;
	
	public static int rollDice() {
		int outcome = (int) Math.floor(Math.random() * 6 + 1);
		return outcome;
	}

	public static int options() {
		int option = (int) Math.floor(Math.random() * 3);
		return option;
	}

	public static void main(String[] args) {
		System.out.println("***** Welcome to Snake and Ladder Game *****");
		int score = 0;
		int options = 0;
		int diceValue = 0;

		while (score <= WIN) {
			diceValue = rollDice();
			options = options();

			switch (options) {
			case NO_PLAY:
				break;

			case LADDER:
				if (score + diceValue > WIN) {
					diceValue = 0;
				}
				score += diceValue;
				break;

			case SNAKE:
				if (score - diceValue < START) {
					score = 0;
				} else {
					score -= diceValue;
				}
			}
			System.out.println(score);
			if (score == WIN) {
				break;
			}
		}
	}
}
