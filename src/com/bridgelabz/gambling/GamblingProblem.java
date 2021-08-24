package com.bridgelabz.gambling;
import java.util.*;
import java.io.*;
public class GamblingProblem {
	public static int stake= 100;
	public static int bet = 1;
	
	 public static int WinOrLose() {
		
		int result = (int) Math.floor(Math.random()*2);
		if(result ==1) {
			System.out.println("WOn the bet!");
			stake++;
		}
		else
		{
			System.out.println("Lost the bet");
			stake--;
		}
		return stake;
	}
	 public static int WinOrLoseLimit() {
		 
		if(stake>=150)
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
	
	
	public static void main(String[] args) {
		int balance=stake;
		WinOrLose();
		WinOrLoseLimit();
	}
}
		
	


