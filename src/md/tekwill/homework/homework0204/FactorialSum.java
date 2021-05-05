package md.tekwill.homework.homework0204;

import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number for factorial:");
        int factorial = 1;
        int f = 1;
        int i = scanner.nextInt();
        for (; f <= i; ++f) {
            factorial = factorial * f;
        }
        System.out.println("The factorial of " + i + " equals " + factorial);
    }
}
