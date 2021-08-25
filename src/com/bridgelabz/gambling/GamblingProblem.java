package com.bridgelabz.gambling;
import java.util.*;
import java.io.*;
public class GamblingProblem {
	public static final int stake= 100;
	public static final int bet = 1;
	public static final int currentBalance=0;
	public static int currentStake;
	public static final int daysPlayed=30;

	 public static void WinOrLose() {
		
		int result = (int) Math.floor(Math.random()*2);
		if(result ==1) {
			
			currentStake=bet+1;
		}
		else
		{
			
			currentStake=bet-1;
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
	
	
	public static void main(String[] args) {
		int currentBalance=stake;
		playMonth();
	}
}
		
	


