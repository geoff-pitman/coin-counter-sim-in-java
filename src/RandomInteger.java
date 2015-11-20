// Author:  Geoffrey Pitman
// Creation Date: March 18, 2015
// Due Date: March 24, 2015
// Course:  CSC 243
// Professor Name: Dr. Kaplan
// Assignment #2: A Coin Counter Simulation
// Filename: RandomInteger.java
// Purpose:  Generates a random integer in a specified range.

import java.util.Random;

public class RandomInteger {

//	private static final long serialVersionUID = 1L;
	
	int low;	// low of range
	int high;	// high of range
	int randomInteger; // Generated random integer in the specified range
	
	private Random rm;
	
	public RandomInteger(int low, int high)
	{
		super();
		
		this.low = low;
		this.high = high;
		
		rm = new Random();
	}
	
	public int nextRandomIntegerInRange()
	{
		int randomInteger = 0;
		
		randomInteger = rm.nextInt(high-low+1)+low;
		
		return randomInteger;
	}
}
