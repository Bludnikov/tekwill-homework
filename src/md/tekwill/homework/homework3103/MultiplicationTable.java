package md.tekwill.homework.homework3103;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the integer number to multiply: ");
        final int numberToMultiply = in.nextInt();
        System.out.println("Please enter the number of times to multiply the number: ");
        final int timesToMultiply = in.nextInt();

        for (int i = 1; i <= timesToMultiply; i++) {
            System.out.println(numberToMultiply + " x " + i + " = " + (numberToMultiply * i));
        }
    }
}
