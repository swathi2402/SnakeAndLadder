package com.Bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WIN = 100;
	public static final int START = 0;

//	Rolling dice using random
	public static int rollDice() {
		int outcome = (int) Math.floor(Math.random() * 6 + 1);
		return outcome;
	}

//	Selecting options on No paly, ladder, snake
	public static int options() {
		int option = (int) Math.floor(Math.random() * 3);
		return option;
	}

	public static void main(String[] args) {
		System.out.println("***** Welcome to Snake and Ladder Game *****");
//		Variable defining
		int player1 = 0;
		int player2 = 0;
		int options = 0;
		int diceValue = 0;
		boolean isPlayer1 = true;

		while (player1 <= WIN || player2 <= WIN) {
			diceValue = rollDice();
			options = options();

			switch (options) {
//			Doing nothing, passing to other player
			case NO_PLAY:
				if (isPlayer1) {
					isPlayer1 = false;
				} else {
					isPlayer1 = true;
				}
				break;

//			Moving farward, one more chance if it is ladder based on flag isPlayer
			case LADDER:
				if (isPlayer1) {
					if (player1 + diceValue > WIN) {
						diceValue = 0;
					}
					player1 += diceValue;
				} else {
					if (player2 + diceValue > WIN) {
						diceValue = 0;
					}
					player2 += diceValue;
				}
				break;

//			Moving backward
			case SNAKE:
				if (isPlayer1) {
					if (player1 - diceValue < START) {
						player1 = 0;
					} else {
						player1 -= diceValue;
					}
					isPlayer1 = false;
				} else {
					if (player2 - diceValue < START) {
						player2 = 0;
					} else {
						player2 -= diceValue;
					}
					isPlayer1 = true;
				}
				break;
			}

			System.out.println("Position:	" + "Player 1: " + player1 + " Player 2:  " + player2);
			
			if (player1 == WIN) {
				System.out.println("Player 1 won the game");
				break;
			} 
			if (player2 == WIN) {
				System.out.println("Player 2 won the game");
				break;
			}
		}
	}
}
