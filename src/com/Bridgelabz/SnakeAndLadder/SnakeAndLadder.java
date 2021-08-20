package com.Bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {
	public static int rollDice() {
		int outcome = (int) Math.floor(Math.random() * 6 + 1);
		return outcome;
	}

	public static void main(String[] args) {
		System.out.println("***** Welcome to Snake and Ladder Game *****");
		int win = 100;
		int start = 0;
		int score = 0;
		System.out.println(rollDice());
	}
}
