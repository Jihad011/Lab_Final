package edu.jhu.cs.oose.fall2017.examples.videorental;

public abstract class Movie {
	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public abstract double calculateRentalPrice(int daysRented);


	public int calculateFrequentRenterPoints(int daysRented) {
		return 1;
	}

	public static Movie createRegularMovie(String title) {
		return new RegularMovie(title);
	}

	public static Movie createNewReleaseMovie(String title) {
		return new NewReleaseMovie(title);
	}

	public static Movie createChildrensMovie(String title) {
		return new ChildrensMovie(title);
	}
}


class RegularMovie extends Movie {
	public RegularMovie(String title) {
		super(title);
	}

	@Override
	public double calculateRentalPrice(int daysRented) {
		double amount = 2;
		if (daysRented > 2) {
			amount += (daysRented - 2) * 1.5;
		}
		return amount;
	}
}

class NewReleaseMovie extends Movie {
	public NewReleaseMovie(String title) {
		super(title);
	}

	@Override
	public double calculateRentalPrice(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int calculateFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
}

class ChildrensMovie extends Movie {
	public ChildrensMovie(String title) {
		super(title);
	}

	@Override
	public double calculateRentalPrice(int daysRented) {
		double amount = 1.5;
		if (daysRented > 3) {
			amount += (daysRented - 3) * 1.5;
		}
		return amount;
	}
}