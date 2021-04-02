package md.tekwill.homework.homework3103;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("Please input one number from 1 to 7 to find out the day of the week");
        int dayInput = day.nextInt();

        switch (dayInput) {
            case 1:
                System.out.println("The day of the week is Monday!");
                break;
            case 2:
                System.out.println("The day of the week is Tuesday!");
                break;
            case 3:
                System.out.println("The day of the week is Wednesday!");
                break;
            case 4:
                System.out.println("The day of the week is Thursday!");
                break;
            case 5:
                System.out.println("The day of the week is Friday!");
                break;
            case 6:
                System.out.println("The day of the week is Saturday!");
                break;
            case 7:
                System.out.println("The day of the week is Sunday!");
                break;
        }
    }
}
