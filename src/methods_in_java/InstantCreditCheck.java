package methods_in_java;

import java.util.Scanner;

//PASSING ARGUMENTS TO METHODS
//Write an 'instant credit check' program that approves anyone who makes more than $25,000 and has a credit score of 700 or better. Reject all others
public class InstantCreditCheck {
    public static void main(String[] args){

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        //Check if the user is qualified
        isUserQualified(creditScore, salary);
    }

    public static void isUserQualified(int creditScore, double salary){
double requiredSalary = 25000;
int requiredCreditScore = 700;

//Add and if statement to check if the user qualifies for loan
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            System.out.println("Congrats! You've been approved!");
        }
        else {
            System.out.println("Sorry, you've been declined.");
        }
    }
}
