package com.plurasight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //take the user input
        System.out.println("Please Enter your Name? FirstName LastName or First Middle Last");
        String fullName = scanner.nextLine().trim();

        //split the fullname by space
        String [] name = fullName.split(" ");


        //check how long the length that will give us a sign whether full name has middle name or not
        switch (name.length){
            case 3->{
                String firstName = name[0];
                String middleName = name[1];
                String lastName = name[2];
                System.out.println("First Name: "+firstName);
                System.out.println("Middle Name: "+middleName);
                System.out.println("Last Name: "+lastName);
            }

            case 2 -> {
                String firstName = name[0];
                String lastName = name[1];

                System.out.println("First Name: " + firstName);
                System.out.println("Middle Name: (none)");
                System.out.println("Last Name: " + lastName);
            }
            default -> {
                System.out.println(
                        "There is no name or the name have more than first and mid and last name.*_*"
                );
            }
        }

    }
}
