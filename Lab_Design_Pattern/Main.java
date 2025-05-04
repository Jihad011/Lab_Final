// package ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

	public static final Movie rosencrantzAndGuildensternAreDead = Movie.createRegularMovie("Rosencrantz and Guildenstern are Dead");
	public static final Movie suckerpunch = Movie.createRegularMovie("Suckerpunch");
	public static final Movie anastasia = Movie.createChildrensMovie("Anastasia");
	public static final Movie braveLittleToaster = Movie.createChildrensMovie("Brave Little Toaster, The");
	public static final Movie citizenKane3D = Movie.createNewReleaseMovie("Citizen Kane 3D");
	public static final Movie riverTamBeatsUpEveryone = Movie.createNewReleaseMovie("River Tam Beats Up Everyone");
	public static final Movie sneakers = Movie.createRegularMovie("Sneakers");

	public static final Customer gretelFishweaver;
	public static final Customer danielleDeBarbarac;
	public static final Customer richardCarlisle;
	public static final Customer murrayHewitt;
	public static final List<Customer> customers;

	static {
		gretelFishweaver = new Customer("Fishweaver, Gretel");
		gretelFishweaver.addRental(new Rental(rosencrantzAndGuildensternAreDead, 2));
		gretelFishweaver.addRental(new Rental(suckerpunch, 2));
		gretelFishweaver.addRental(new Rental(anastasia, 1));
		gretelFishweaver.addRental(new Rental(braveLittleToaster, 5));
		gretelFishweaver.addRental(new Rental(citizenKane3D, 1));
		gretelFishweaver.addRental(new Rental(riverTamBeatsUpEveryone, 3));

		danielleDeBarbarac = new Customer("de Barbarac, Danielle");
		danielleDeBarbarac.addRental(new Rental(anastasia, 2));
		danielleDeBarbarac.addRental(new Rental(anastasia, 2));
		danielleDeBarbarac.addRental(new Rental(anastasia, 2));

		richardCarlisle = new Customer("Carlisle, Sir Richard");
		richardCarlisle.addRental(new Rental(citizenKane3D, 10));

		murrayHewitt = new Customer("Hewitt, Murray");
		murrayHewitt.addRental(new Rental(sneakers, 947));

		customers = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(gretelFishweaver,
				danielleDeBarbarac, richardCarlisle, murrayHewitt)));
	}

	public static void main(String[] args) {
		for (Customer customer : customers) {
			System.out.println(customer.generateStatement());
			System.out.println("********************************************************************************");
		}
	}
}
