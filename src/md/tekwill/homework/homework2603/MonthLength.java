package md.tekwill.homework.homework2603;

import java.util.Scanner;

public class MonthLength {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("Please input month number:");
        int monthInput = month.nextInt();

        switch (monthInput) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Total number of days = 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Total number of days = 30");
            case 2:
                System.out.println("Total number of days = 28 or 29");

        }
    }
}