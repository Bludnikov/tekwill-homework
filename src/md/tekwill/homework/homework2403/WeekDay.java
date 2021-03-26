//3. Write a Java program that reads a number from the user and displays the name of the weekday based on user's number.
//Test Data
//Input number: 3
//Expected Output :
//Wednesday

package md.tekwill.homework.homework2403;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {

//        int mon = 1;
//        int tue = 2;
//        int wed = 3;
//        int thu = 4;
//        int fri = 5;
//        int sat = 6;
//        int sun = 7;

        Scanner weekDay = new Scanner(System.in);
        System.out.println("Please input the number of the week day: ");

        int weekDayInput = weekDay.nextInt();

        if (weekDayInput == 1)
            System.out.println("The week day is Monday");
        else if (weekDayInput == 2)
            System.out.println("The week day is Tuesday");
        else if (weekDayInput == 3)
            System.out.println("The week day is Wednesday");
        else if (weekDayInput == 4)
            System.out.println("The week day is Thursday");
        else if (weekDayInput == 5)
            System.out.println("The week day is Friday");
        else if (weekDayInput == 6)
            System.out.println("The week day is Saturday");
        else if (weekDayInput == 7)
            System.out.println("The week day is Sunday");

    }
}
