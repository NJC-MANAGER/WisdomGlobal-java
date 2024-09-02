package fill_blank_challenge;

import java.util.Scanner;

public class UserGuidance {
    public static void main (String[] args){
        //Program Requirements
        //Ask the user to provide
        //1. Season of the year
        //2. Whole number(integer)
        //3. Adjective
        //Store and Print
        //Store the input variables
        //Print a story by filling in the blanks with a variables value

        //Fill-in-challenge
        // On a ADJECTIVE SEASON day, I drink a minimum of NUMBER cups of coffee.
String seasonOfYear = "";
        System.out.println("What is your season of the year?");
        Scanner scanner = new Scanner(System.in);
        seasonOfYear =scanner.next();
    int numberOfCups = 0;
        System.out.println(" How many cups of coffee do you take?");
        numberOfCups = scanner.nextInt();
    String seasonDescription = "";
        System.out.println("What is the adjective to decsribe your season of the year?");
        seasonDescription = scanner.next();

        scanner.close();

        System.out.println("Challenge: " + "On a " + seasonDescription + " " + seasonOfYear + " day, I drink a minimum of " + numberOfCups +  " cups of coffee.");
    }
}
