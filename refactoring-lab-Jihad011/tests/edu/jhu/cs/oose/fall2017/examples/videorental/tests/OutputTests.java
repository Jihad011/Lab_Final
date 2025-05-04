package edu.jhu.cs.oose.fall2017.examples.videorental.tests;

import edu.jhu.cs.oose.fall2017.examples.videorental.Customer;
import edu.jhu.cs.oose.fall2017.examples.videorental.Main;
import org.junit.Assert;

import org.junit.Test;


public class OutputTests
{
	@Test
	public void testGretel()
	{
		testCustomerWithExpectedOutput(Main.gretelFishweaver, "Rental Record for Fishweaver, Gretel\n"
				+ "    Rosencrantz and Guildenstern are Dead     (02)  $ 2.00\n"
				+ "    Suckerpunch                               (02)  $ 2.00\n"
				+ "    Anastasia                                 (01)  $ 1.50\n"
				+ "    Brave Little Toaster, The                 (05)  $ 4.50\n"
				+ "    Citizen Kane 3D                           (01)  $ 3.00\n"
				+ "    River Tam Beats Up Everyone               (03)  $ 9.00\n" + "Amount owed is $22.00\n"
				+ "You earned 7 frequent renter points");
	}

	@Test
	public void testDanielle()
	{
		testCustomerWithExpectedOutput(Main.danielleDeBarbarac, "Rental Record for de Barbarac, Danielle\n"
				+ "    Anastasia                                 (02)  $ 1.50\n"
				+ "    Anastasia                                 (02)  $ 1.50\n"
				+ "    Anastasia                                 (02)  $ 1.50\n" + "Amount owed is $ 4.50\n"
				+ "You earned 3 frequent renter points");
	}

	@Test
	public void testRichard()
	{
		testCustomerWithExpectedOutput(Main.richardCarlisle, "Rental Record for Carlisle, Sir Richard\n"
				+ "    Citizen Kane 3D                           (10)  $30.00\n" + "Amount owed is $30.00\n"
				+ "You earned 2 frequent renter points");
	}

//	@Test
//	public void testMurray()
//	{
//		testCustomerWithExpectedOutput(Main.murrayHewitt, "Rental Record for Hewitt, Murray\n"
//				+ "    Sneakers                                  (947)  $ 0.00\n" + "Amount owed is $ 0.00\n"
//				+ "You earned 1 frequent renter points");
//	}

	private static void testCustomerWithExpectedOutput(Customer customer, String output)
	{
		Assert.assertEquals(output, customer.generateStatement());
	}
}
