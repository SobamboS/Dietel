package Chapter2;

import java.util.Scanner;

public class Arithmethic {  // class
    public static void main (String[] args) {  // main method

        Scanner input = new Scanner(System.in);   // create a scanner to obtain input from the user

        System.out.print("Enter first number : ");   // prompt user to input first number
        Double number1 = input.nextDouble();  // read first number

        System.out.print("Enter second number : ");   // prompt user to input second number
        Double number2 = input.nextDouble();  // read second number

        Double square1 = number1 * number1;   // calculate square of the first number
        Double square2 = number2 * number2;   // calculate square of the second number

        System.out.printf("Square of first number : %f%n", square1);  // print square of the first number
        System.out.printf("Square of second number : %f%n", square2);   // print square of the second number

        Double sum = square1 + square2;   // calculate the sum of the square of number 1 and number 2
        System.out.printf("Sum of their square : %f%n", sum); // print the sum

        Double difference = square1 - square2;   // calculate the difference of the square of number 1 and number 2
        System.out.printf("Difference of their square : %f%n", difference);   // print the difference
    }

}
