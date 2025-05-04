// package edu.jhu.cs.oose.fall2017.examples.videorental;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}


	public double calculatePrice() {
		return movie.calculateRentalPrice(daysRented);
	}

	public int calculateFrequentRenterPoints() {
		return movie.calculateFrequentRenterPoints(daysRented);
	}
}
