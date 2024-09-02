package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String[] args){
        System.out.println("Hello World! Am Faith an upcoming Java-Newgen developer");
          //Calculate an employee's pay(Algorithm steps)
        //1. Get the number of hours worked
       // int hours = 40; initialize it with zero
        int hours = 0;
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //2. Get the hourly pay rate
        //double payRate = 25.50; initialize it to zero
        double payRate = 0;
        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();
        scanner.close();
        //3. Multiply hours by pay rate
        double grossPay = hours * payRate;
        //4. Display results
        System.out.println("Gross Pay: " + grossPay);


    }
}
