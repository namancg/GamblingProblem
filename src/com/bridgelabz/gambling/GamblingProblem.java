package com.bridgelabz.gambling;
import java.util.*;
public class GamblingProblem {
	static final int stake= 100;
	static final int bet = 1;
	
	public class WinOrLose{
		
		int result = (int) Math.floor(Math.random()*100);
		if(result < 50) {
			System.out.println("WOn the bet!");
		}
		else
		{
			System.out.println("Lost the bet");
		}
	}
	
	public static void main(String[] args) {
		
	}

}
