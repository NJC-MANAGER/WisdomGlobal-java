package logical_operators;

import java.util.Scanner;

// PROBLEM
// To qualify for a loan, a person must make at least $30,000 and have been working at their current job for at least two years.
public class CustomerCreditScore {
    public static void main(String[] args) {
        // Define requirements
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Create a Scanner object to get input
        Scanner scanner = new Scanner(System.in);

        // Get salary input from the user
        System.out.println("Enter your annual salary:");
        int salary = scanner.nextInt();

        // Get number of years employed input from the user
        System.out.println("Enter the number of years you've worked at your current job:");
        int years = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Check if the user qualifies for the loan
        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats! You qualify for the loan.");
        } else {
            System.out.println("Sorry, you do not qualify for the loan.");
        }
    }
}
