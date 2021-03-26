//1. Write a Java program to get a number from the user and print whether it is positive or negative.
//Test Data
//Input number: 35
//Expected Output :
//Number is positive

package md.tekwill.homework.homework2403;

import java.util.Scanner;

public class PosNumber {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please input your number:");

        int numberInput = number.nextInt();

        if (numberInput > 0)
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");

    }
}
