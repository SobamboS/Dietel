package Chapter2;

import java.util.Scanner; // program uses class Scanner

public class ProductOfThreeInteger {  // class
    public static void main(String[] args){  // main method

        Scanner input = new Scanner(System.in); // create a scanner to obtain input from the user

        System.out.print("Enter First Integer : "); // prompt user to input first integer
        Double number1 = input.nextDouble();

        System.out.print("Enter Second Integer : ");  // prompt user to input second integer
        Double number2 = input.nextDouble();

        System.out.print("Enter Third Integer : ");  // prompt user to input third integer
        Double number3 = input.nextDouble();

Double product = (number1 * number2 * number3); // finds the product of the integers

        System.out.printf("The product is : %f%n", product);
    }
}
