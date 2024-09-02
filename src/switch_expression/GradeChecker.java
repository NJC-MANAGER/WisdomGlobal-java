package switch_expression;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args){
            System.out.println("Enter your letter:");
            Scanner scanner = new Scanner(System.in);
            String grade = scanner.next();
            scanner.close();
            String message = switch (grade) {                           //we pass a variable not a string
                case "A" -> "Excellent job!";
                case "B" -> " Great job!";
                case "C" -> "Good job";
                case "D" -> "You need to work a bit harder";
                case "F" -> "Uh oh!";
                default -> "Error, invalid grade!";
            };
        System.out.println(message);

    }
}
