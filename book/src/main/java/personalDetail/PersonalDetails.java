package personalDetail;

import java.util.Scanner;

public class PersonalDetails {

	public void details() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter ur name:");
		String detail = in.nextLine();
		System.out.println("Enter ur contact no:");
		String num = in.nextLine();

		

			System.out.println("Enter the no.of.Seats u want to book:");
			int seats = in.nextInt();

			System.out.println("Choose the type of seats \n1.Couple \n2.Reclainer \n3.Balcony");
			int type = in.nextInt();
            int price = 0;

			if (type == 1) {
				price=seats * 250;
				System.out.println("Total Cost of " + seats + " tickets is " + price + "rupees");
			}
			if (type == 2) {
				price=seats * 200;
				System.out.println("Total Cost of " + seats + " tickets is " + price + "rupees");
			}
			if (type == 3) {
				price=seats * 150;
				System.out.println("Total Cost of " + seats + " tickets is " + price + "rupees");
			}

			System.out.println("To confirm ur booking enter (1) else (2) for cancelling");
			int conf = in.nextInt();

			if (conf == 1) {
				System.out.println(detail + "\n" + num + "\n" + seats + " tickets have confirmed and booked\nPRICE:"+price+" rupees\nPAYMENT STATUS: PAID");
			} else if (conf == 2) {
				System.out.println("\nBOOKING TICKETS WAS CANCELLED");
			} else {
				System.out.println("\nERRON INPUT");
			}

		
	}

}
