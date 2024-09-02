package methods_in_java;
//Refactor this isUserQualified method to return a boolean value of true or false
//and have another method notify the user
//SOLUTION STEPS
//1. Change the return type from void to boolean
import java.util.Scanner;

public class InstantCreditCheckReturn {
    public static void main(String[] args){

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int ActualCreditScore = scanner.nextInt();
        scanner.close();

        //Check if the user is qualified
       boolean qualified= isUserQualified(ActualCreditScore, actualSalary);
  notifyUser(qualified);
    }

    public static boolean isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

//Add and if statement to check if the user qualifies for loan
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
           // System.out.println("Congrats! You've been approved!");
            return true;
        }
        else {
           // System.out.println("Sorry, you've been declined.");
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else {
            System.out.println("Sorry! You've been declined");
        }
    }
}
