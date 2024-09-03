package objects_in_java;

import java.util.Scanner;

public class HomeAreaCalculatorWithObjectReturnType {
    public static void main(String[] args){
        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();

        double area = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area );
    }
    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
    public static Rectangle getRoom(){
        System.out.println("Enter the length of your room:");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }
}
