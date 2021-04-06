package md.tekwill.homework.homework2903;

import java.util.Scanner;

public class HouseDevice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number from \"0\" to \"5\" to perform an action.");
        System.out.println("Odd numbers will disable a device, even numbers will enable a device.");

        int inputUser = input.nextInt();

        switch (inputUser) {
            case 0:
                System.out.println("You've enabled the lights in the bathroom.");
                break;
            case 1:
                System.out.println("You've disabled the lights in the bathroom.");
                break;
            case 2:
                System.out.println("You've turned on the air conditioner.");
                break;
            case 3:
                System.out.println("You've turned off the air conditioner.");
                break;
            case 4:
                System.out.println("You've lowered the blinds.");
                break;
            case 5:
                System.out.println("You've raised the blinds.");
                break;
        }
    }
}
