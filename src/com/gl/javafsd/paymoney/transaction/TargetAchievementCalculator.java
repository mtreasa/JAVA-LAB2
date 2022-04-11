package com.gl.javafsd.paymoney.transaction;

import java.util.Arrays;

public class TargetAchievementCalculator {
	private int[] transactions;
	private int dailyTarget;
	private boolean dailyTargetAchieved;
	private int transactionCounter;

	public TargetAchievementCalculator(int[] transactions, int dailyTarget) {
		this.transactions = transactions;
		this.dailyTarget = dailyTarget;
		this.dailyTargetAchieved = false;
		this.transactionCounter = 0;
	}

	public void calculate() {
		int tempCounter = 0;
		// 20,12,31 - transactions
		// 21
		for (int index = 0; index < transactions.length; index++) {
			int targetValue = transactions[index];
			tempCounter = tempCounter + targetValue;
			transactionCounter++;
			if (tempCounter >= dailyTarget) {
				dailyTargetAchieved = true;
				break;
			}
		}
	}

	public void printOutcome() {
		if (dailyTargetAchieved == true) {
			System.out.println(
					"Daily target of " + dailyTarget + " is achieved after " + transactionCounter + " transactions.");
		} else {
			System.out.println("Daily target of " + dailyTarget + " is not achieved");
		}
	}

}
