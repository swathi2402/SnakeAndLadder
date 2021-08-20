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
		int position = 0;
		int options = 0;
		int diceValue = 0;
		int count = 0;
		
		while (position <= WIN) {
			diceValue = rollDice();
			options = options();

			switch (options) {
			case NO_PLAY:
				break;

			case LADDER:
				if (position + diceValue > WIN) {
					diceValue = 0;
				}
				position += diceValue;
				break;

			case SNAKE:
				if (position - diceValue < START) {
					position = 0;
				} else {
					position -= diceValue;
				}
			}
			System.out.println("Position: " + position);
			count += 1;
			if (position == WIN) {
				break;
			}
		}
		System.out.println("Total number of time the dice rolled: " + count);
	}
}
