package com.bridgelabz.gambling;
import java.util.*;
import java.io.*;
public class GamblingProblem {
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

	 public static int WinOrLose() {
		
		int result = (int) Math.floor(Math.random()*2);
		if(result ==1) {
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
		}
		return stake;
	}
	 public static int WinOrLoseLimit() {
		 
		if(currentBalance>=150)
		{
			System.out.println("Maximum reached! Stop playing");
		}
		else if(stake<=50)
		{
			System.out.println("You have exhausted 50%. Stop Playing");
		}
		else
			System.out.println("Continue playing");
		return 0;
	}
	public static int getTotalAmount() {
		int daysPlayed=20;
			int totalWinnings=0;
		for (int i=0;i<daysPlayed;i++) {
			int cashPerDay=stake;
			WinOrLoseLimit();
			totalWinnings=totalWinnings+cashPerDay;
		}
		System.out.println("Total money won after"+i+"is "+totalWinnings);
	}
	
	public static void main(String[] args) {
		int currentBalance=stake;
		System.out.println("Want to check if you won or not?");
		WinOrLose();
		System.out.println("Total winnings check");
		WinOrLoseLimit();
<<<<<<< HEAD
>>>>>>> origin/gambling-use-case-3
=======
		getTotalAmount();
		
		
>>>>>>> origin/gambling-use-case-4
	}
}
		
	


