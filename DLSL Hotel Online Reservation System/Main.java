/*Author: Jan Aslley U. Cortez*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! Welcome to DLSL Hotel Reservation System.");
        boolean valid_user = false;

        while (!valid_user) {
            System.out.println("Please choose what type of user you are:\n\r- Client\n\r- Receptionist\n\r- Manager");
            System.out.println();
            String userType = scanner.nextLine().toLowerCase();

            if (userType.equals("client")) {
                // Redirect to Client screen
                Client.main(new String[0]);
                valid_user = true;
            } else if (userType.equals("receptionist")) {
                //ReceptionistSystem.start();
                valid_user = true;
            } else if (userType.equals("manager")) {
                //Manager.main(new String[0]);
                valid_user = true;
            } else {
                System.out.println("Invalid user type.");
            }
        }
        scanner.close();
    }
}
