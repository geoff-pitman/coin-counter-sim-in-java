// Author:  Geoffrey Pitman
// Creation Date: March 18, 2015
// Due Date: March 24, 2015
// Course:  CSC 243
// Professor Name: Dr. Kaplan
// Assignment #2: A Coin Counter Simulation
// Filename: TestCoins.java
// Purpose: This file contains instantiations of six sub-classes of the super-class Coin.
//			It provides a method for testing the functionality of the sub-classes.

public class TestCoins {
	
	Penny aPenny = new Penny();
	Nickel aNickel = new Nickel();
	Dime aDime = new Dime();
	Quarter aQuarter = new Quarter();
	HalfDollar aHalf = new HalfDollar();
	Dollar aDollar = new Dollar();
	
	void testCoinOutput()
	{
		System.out.println("Coin: " + aPenny.getName() + "   Value: $" + (double)aPenny.getValue()/100);
		System.out.println("Coin: " + aNickel.getName() + "   Value: $" + (double)aNickel.getValue()/100);
		System.out.println("Coin: " + aDime.getName() + "   Value: $" + (double)aDime.getValue()/100);
		System.out.println("Coin: " + aQuarter.getName() + "   Value: $" + (double)aQuarter.getValue()/100);
		System.out.println("Coin: " + aHalf.getName() + "   Value: $" + (double)aHalf.getValue()/100);
		System.out.println("Coin: " + aDollar.getName() + "   Value: $" + (double)aDollar.getValue()/100);
	}

}
