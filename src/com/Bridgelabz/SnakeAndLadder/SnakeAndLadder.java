package com.Bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {
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
		int win = 100;
		int start = 0;
		int score = 0;
		int options = 0;
		int currentScore = 0;
		while (score <= win) {
			currentScore = rollDice();
			options = options();
			switch (options) {
			case 0:
				break;

			case 1:
				score += currentScore;
				break;

			case 2:
				if (score - currentScore < 0) {
					score = 0;
				} else {
					score -= currentScore;
				}
			}
			System.out.println(score);
		}
	}
}
