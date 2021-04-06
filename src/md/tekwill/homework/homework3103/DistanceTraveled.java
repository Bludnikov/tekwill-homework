package md.tekwill.homework.homework3103;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the vehicle speed:");
        final int speed = in.nextInt();
        System.out.println("Please input the travel time");
        final int time = in.nextInt();
        System.out.println("Hour   " + " Distance Traveled");
        System.out.println("------------------------------");

        for (int i = 1; i <= time; i++ ) {
            int distance = i * speed;
            System.out.println(i +"             " + distance);
        }
    }
}
