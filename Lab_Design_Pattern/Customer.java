// package edu.jhu.cs.oose.fall2017.examples.videorental;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;


public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addRental(Rental rental) {
		this.rentals.add(rental);
	}

	public String generateStatement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Formatter formatter = new Formatter();
		formatter.format("Rental Record for %s\n", getName());

		for (Rental rental : this.rentals) {
			double rentalAmount = rental.calculatePrice();
			frequentRenterPoints += rental.calculateFrequentRenterPoints();

			formatter.format("    %-40s  (%02d)  $%5.2f\n", rental.getMovie().getTitle(), rental.getDaysRented(), rentalAmount);
			totalAmount += rentalAmount;
		}

		formatter.format("Amount owed is $%5.2f\n", totalAmount);
		formatter.format("You earned %d frequent renter points", frequentRenterPoints);

		String result = formatter.out().toString();
		formatter.close();
		return result;
	}
}
