package md.tekwill.homework.homework3103;

import java.util.Scanner;

public class CumulatedSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input number.");
        int sum = 0;
        for (int userInput = in.nextInt(); userInput != 0; userInput = in.nextInt()) {
            sum += userInput;
            System.out.println("The sum of the entered integers is: " + sum);

        }
    }
}
