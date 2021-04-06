package md.tekwill.homework.homework3103;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two numbers:");

        int sum = 0;
        int sumFinal = 0;
        for (int numberOne = scanner.nextInt(), numberTwo = scanner.nextInt(); numberOne < numberTwo;  ++numberOne) {
            sum += numberOne;
            sumFinal = sum + numberTwo;
        }
        System.out.println("The sum of all integers equals " + (sumFinal));
    }
}
