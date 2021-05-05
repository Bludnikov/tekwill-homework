package md.tekwill.homework.homework0504;

import java.util.Scanner;

public class ConversionMilesToKm {
    public static void main(String[] args) {

        System.out.println("Miles    Kilometers");
        for (int i = 1; i <= 10; ++i) {
            int m = 1;
            double k = (m * i * 1.609);
            System.out.println(m * i + "        " + k);
        }
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the required distance in miles:");

        int kilometers = in.nextInt();
        double miles = kilometers * 1.609;

        System.out.println("The corresponding distance is equal to " + miles + " kilometers");


    }
}