package com.bridgelabz.gambling;
import java.util.*;
import java.io.*;
public class GamblingProblem {
<<<<<<< HEAD
<<<<<<< HEAD
	static final int stake= 100;
	static final int bet = 1;
	
	public class WinOrLose{
		
		int result = (int) Math.floor(Math.random()*100);
		if(result < 50) {
			System.out.println("WOn the bet!");
=======
	public static int stake= 100;
	public static int bet = 1;
	public static int currentBalance=0;
	public static int currentWinning[];
=======
	public static final int stake= 100;
	public static final int bet = 1;
	public static final int currentBalance=0;
	public static int currentStake;
	public static final int daysPlayed=30;
>>>>>>> origin/gambling-use-case-5

	 public static void WinOrLose() {
		
		int result = (int) Math.floor(Math.random()*2);
		if(result ==1) {
<<<<<<< HEAD
			System.out.println("WOn the bet!");
			stake++;
>>>>>>> origin/gambling-use-case-3
		}
		else
		{
			System.out.println("Lost the bet");
<<<<<<< HEAD
		}
	}
	
	public static void main(String[] args) {
		
=======
			stake--;
=======
			
			currentStake=bet+1;
		}
		else
		{
			
			currentStake=bet-1;
>>>>>>> origin/gambling-use-case-5
		}
		
	}
	 public static int WinOrLoseLimit() {
		 boolean resign=false;
		 WinOrLose();
		if(currentStake>=stake*1.5 || currentStake <=0.5)
		{
			resign=true;
		}
		else 
		{
			resign=false;
			
		}
		return currentStake;
	}
	public static void getTotalAmount() {
		int daysPlayed=20;
			int totalWinnings=0;
			int i;
		for (i=1;i<=daysPlayed;i++) {
			int cashPerDay=stake;
			WinOrLoseLimit();
			totalWinnings=totalWinnings+cashPerDay;
		}
		System.out.println("Total money won after"+i+"is "+totalWinnings);
		
	}
	
	public static void playMonth() {
		int gamesWon=0, gamesLost=0, totalWinnings=0, totalLost=0;
		for (int i = 1; i <= daysPlayed; i++) {
			currentStake = stake;
			WinOrLose();
			if(currentStake >= stake*1.5) {
				gamesWon++;
				totalWinnings+=currentStake-stake;
			}
			else {
				gamesLost++;
				totalLost+=stake-currentStake;
			}
		}
		System.out.println("Games Won: "+gamesWon+".\n Won $"+totalWinnings);
		System.out.println("Games Lost: "+gamesLost+".\n Lost $"+totalLost);
		}
	public static void luckiestAndUnluckiestDay() {
		int maxWinnings=0, minWinnings=9999, luckiestMonth=0, unluckiestMonth=0 ,totalStake=0 ,monthsPlayed=12,totalEarning=0;
		for(int j=0;j<monthsPlayed; j++)
			totalStake=0;
		{
			for (int i = 1; i <= daysPlayed; i++) {
				currentStake = stake;
				WinOrLose();
				totalStake += currentStake;
				if(maxWinnings<totalEarning) {
					luckiestMonth = i;
					maxWinnings=totalEarning;
				}
				if(minWinnings>totalEarning) {
					unluckiestMonth = i;
					minWinnings=totalEarning;
				}
			}
		}
		System.out.println("Luckiest Month "+luckiestMonth);
		System.out.println("Unluckiest Month "+unluckiestMonth);
	}
	public static void nextMonth() {
		
		int gamesWon=0, gamesLost=0, monthsPlayed=0;
		while(true) {
			monthsPlayed++;
			for (int i = 1; i <= daysPlayed; i++) {
				currentStake = stake;
				WinOrLose();
				if(currentStake >= stake*1.5) {
					gamesWon++;
				}
				else {
					gamesLost++;
				}
			}
			if(gamesWon<gamesLost)
				break;
		}
		
		System.out.println("Months played: "+monthsPlayed);
		
	}

	
	
	public static void main(String[] args) {
<<<<<<< HEAD
		int currentBalance=stake;
<<<<<<< HEAD
		System.out.println("Want to check if you won or not?");
		WinOrLose();
		System.out.println("Total winnings check");
		WinOrLoseLimit();
<<<<<<< HEAD
>>>>>>> origin/gambling-use-case-3
=======
		getTotalAmount();
		
		
>>>>>>> origin/gambling-use-case-4
=======
		playMonth();
<<<<<<< HEAD
>>>>>>> origin/gambling-use-case-5
=======
		luckiestAndUnluckiestDay();
>>>>>>> origin/gambling-use-case-6
=======
		
		nextMonth();
>>>>>>> origin/gambling-use-case-7
	}
}
		
	


