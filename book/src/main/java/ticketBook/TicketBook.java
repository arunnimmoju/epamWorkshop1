package ticketBook;

import java.util.Scanner;

import personalDetail.PersonalDetails;

class movieSelect {

	private Scanner input;

	public movieSelect() // method for selecting movie and selection
	{

		System.out.println("Select a amovie uh want to watch \n1.LOVE AAJ KAL \n2.MALANG \n3.PRESSURE COOKER");

		input = new Scanner(System.in);
		int movie = input.nextInt();

		PersonalDetails d = new PersonalDetails();

		if (movie == 1) {
			System.out.println(
					"LOVE AAJ KAL is availabe in below locations\n1.BVK LB Nagar \n2.MIRAJ Dilsuknagar \n3.INOX Kachiguda");
			int loc = input.nextInt();

			if (loc == 1 || loc == 2 || loc == 3) {
				d.details();
			} else {
				System.out.println("\n****please choose the available location for ur film****");
			}
		}

		else if (movie == 2) {
			System.out.println(
					"MALANG is availabe in below locations \n1.VIAJALAKSHMI THEATRE Dilsuknagar \n2.RAJADHANI Kothapet  \n3.CINIPOLIS Attapur");
			int loc = input.nextInt();

			if (loc == 1 || loc == 2 || loc == 3) {
				d.details();
			}
		} else if (movie == 3) {
			System.out.println(
					"PRESSURE COOKER is availabe in below locations\n1.SENSATION Kairathabad \n2.MB Theartre Gachibowli\n3.INOX Secunderabad");
			int loc = input.nextInt();

			if (loc == 1 || loc == 2 || loc == 3) {
				d.details();
			}
		} else {
			System.out.println("\n****please choose the available film****");
		}

	}
}

public class TicketBook {
	public static void main(String[] args) {
		movieSelect m = new movieSelect();
	}
}
