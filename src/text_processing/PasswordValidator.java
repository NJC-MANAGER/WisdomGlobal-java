package text_processing;

import java.util.Scanner;
//CHALLENGE
//Validate the complexity/strength of a proposed password
//PROGRAM REQUIREMENTS
//Given:
//Username: johndoe
//password: ABC_1234
//Ask the user to provide:
//New password
//Verify that the new password:
//At least eight characters long
//contains an uppercase letter
//contain a special character
// Does not contain the username (johndoe)
//Is not the same as the old password(ABC_1234)
public class PasswordValidator {
    // Declare variables for existing username & password
    private static String currentUsername = "johndoe";
    private static String currentPassword = "ABC_1234";

    public static void main(String[] args) {
        printPasswordRules();
        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do {
            System.out.println("Enter your new password:");
            String proposedPassword = scanner.nextLine();  // Changed var to String
            valid = changePassword(proposedPassword);
        } while (!valid);

        System.out.println("The proposed password is valid.");
        scanner.close();
    }

    public static void printPasswordRules() {
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* At least 8 characters long");
        System.out.println("* Contain an uppercase letter");
        System.out.println("* Contain a special character");
        System.out.println("* Not contain the username");
        System.out.println("* Not be the same as the old password");
        System.out.println();
    }

    // Checks to see if the password is valid
    public static boolean changePassword(String newPassword) {
        boolean valid = true;
        String errorMessage = "";

        if (newPassword.length() < 8) {
            valid = false;
            errorMessage += "\nYour password must contain at least 8 characters.";
        }

        // Check if the password contains an uppercase letter
        if (newPassword.equals(newPassword.toLowerCase())) {
            valid = false;
            errorMessage += "\nYour password must include at least one uppercase letter.";
        }

        // Check if the password contains a special character
        if (newPassword.matches("[a-zA-Z0-9]*")) {
            valid = false;
            errorMessage += "\nYour password must include at least one special character (e.g., %, $, [:).";
        }

        // Check if the password contains the username
        if (newPassword.toUpperCase().contains(currentUsername.toUpperCase())) {
            valid = false;
            errorMessage += "\nYour password cannot contain your username.";
        }

        // Check if the password is the same as the current password
        if (newPassword.equals(currentPassword)) {
            valid = false;
            errorMessage += "\nYour password must be different from your current password.";
        }

        if (!valid) {
            System.out.println(errorMessage);
        }

        return valid;
    }
}
