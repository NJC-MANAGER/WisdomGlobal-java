package repetition_structures;
//BREAK STATEMENT
//Search a string to determine if it contains the letter A

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args){
        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for(int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);  //this will give us the current letter that we will be working on inside a string
            if(currentLetter == 'A' || currentLetter == 'a'){  // Corrected comparison here
                letterFound = true;
                break;
            }
        }

        // Output result
        if(letterFound) {
            System.out.println("The letter 'A' was found.");
        } else {
            System.out.println("The letter 'A' was not found.");
        }
    }
}
