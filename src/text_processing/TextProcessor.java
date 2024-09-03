package text_processing;
//1. Strings-challenge
//Write a method that counts the number of words in a string and prints each one on a new line.
//2. Challenge
//Write a method that prints a given string backward.
//For example, if given stop, it prints pots.

//Solution
//Splits a String into an array by tokenizing it.
//Counts words and prints them
//@param text Full string to be split

public class TextProcessor {
    public static void main(String[] args){
        countWords("I love Java");
        reverseString("stop");
    }
    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }

    }

    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
