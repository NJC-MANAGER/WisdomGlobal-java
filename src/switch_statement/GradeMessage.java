package switch_statement;

import java.util.Scanner;

//SWITCH
//Have a user enter their letter grade, and using a switch statement, print out a message letting them know how they did.
public class GradeMessage {
    public static void main(String[] args){
        System.out.println("Enter your letter:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;
        switch (grade){                           //we pass a variable not a string
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = " Great job!";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error, invalid grade!";
                break;
        }
        System.out.println(message);
    }

}
