package md.tekwill.homework.homework2603;

import java.util.Scanner;

public class FatCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of calories in your item:");
        float calInput = in.nextFloat();

        System.out.println("Please enter the quantity of fat in your item");
        float fatInput = in.nextFloat();

        float calFat = fatInput * 9;
        float percentage = calFat / calInput * 100;

        System.out.println("The percentage of calories from fat is equal to: " + percentage + "%.");
        if (percentage < 30)
            System.out.println("The food is low in fat!");


    }
}
