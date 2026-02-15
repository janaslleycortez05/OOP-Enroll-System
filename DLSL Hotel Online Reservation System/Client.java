import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileWriter;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean valid_response = false;

        String client_id = "";

        System.out.print("Have you registered already?(Y/N):");
        String response = sc.nextLine().toUpperCase();

        if ("Y".equals(response)) {
            valid_response = true;
            System.out.println("May i have your client ID: ");
            client_id = sc.nextLine();
        } else if ("N".equals(response)) {

            System.out.print("Fullname: ");
            String fullname = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Contact Information: ");
            String contactinformation = sc.nextLine();

            System.out.print("Email Address: ");
            String emailaddress = sc.nextLine();

            client_id = generateClientID();

            
            valid_response = true;
        } else {
            System.out.println("Invalid response");
        }
        System.out.println(
                "\n Here are the list of the facilities that you can chose from. Please take note that their is a Maximum capacity to each rooms. If you wish to reserve for more guest..it will cost Php 800 get's for exta person./n");

        System.out.println("------------------------------------------");

        System.out.println("Facility\t\tPrice per Unit\t\tMaximum # of Pax");

        System.out.println("---------------------------------------------");

        System.out.println("Single\t\tPhp 1,500,00\t\t2");

        System.out.println("Double\t\tPhp 2,500,00\t\t3");

        System.out.println("King\t\tPhp 3,500,00\t\t4");

        System.out.println("Suite\t\tPhp 4,000,00\t\t6");

        System.out.println("");
    }

    public static String generateClientID() {
        System.out.print("Thank you for registering. Here is your Client ID: ");
        String client_id = ("C" + String.valueOf((int) (Math.random() * ((99999 - 10000) + 1))));
        System.out.println(client_id);
        return client_id;
    }

    public static void createFile() {
        try {
            File myObj = new File("CLIENT.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return client_id + generateClientID;
        }
        
        try {
      FileWriter myWriter = new FileWriter("CLIENT.txt");
      myWriter.write("Fullame: " + name + "\nAddress: " + address + "\nContact Information: " + contactinformation + "\nEmail Address: " + emailaddress);
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
        return client_id + generateClientID;
    }
  }
    }