package com.bridgelabz.gambling;
import java.util.*;
public class GamblingProblem {
	public static final int stake= 100;
	public static final int bet = 1;
	
	 public class WinOrLose{
		
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
	}
	 public class WinOrLoseLimit {
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
	}
	
	
	public static void main(String[] args) {
		int balance=stake;
	}


