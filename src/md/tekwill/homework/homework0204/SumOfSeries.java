package md.tekwill.homework.homework0204;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input number of therms:");
        int val = 2;
        int sum = 0;
        for (int userInput = input.nextInt(); userInput >= 1; --userInput) {
            sum += (val * userInput);
        }
        System.out.println(sum);
    }
}