package md.tekwill.homework.homework2603;

import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter one of the following mediums: \"air\", \"water\", \"steel\":");
        String mediumInput = in.nextLine();
        System.out.println("Please input distance:");
        int distanceInput = in.nextInt();


        if (mediumInput.equalsIgnoreCase("air")) {
            System.out.println("The time needed to travel the " + distanceInput + " feet distance through the " + mediumInput + " equals:" + (distanceInput/1100) + " seconds");
        }
        else if (mediumInput.equalsIgnoreCase("water")) {
            System.out.println("The time needed to travel the " + distanceInput + " feet distance through the " + mediumInput + " equals:" + (distanceInput/4900) + " seconds");
        }
        else if (mediumInput.equalsIgnoreCase("steel")) {
            System.out.println("The time needed to travel the " + distanceInput + " feet distance through the " + mediumInput + " equals:" + (distanceInput/16400) + " seconds");
        }
        else {
            System.out.println("You entered an unknown medium.");
        }
        }
    }

// Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a medium (\"air\", \"water\" or \"steel\"): ");
//        String mediumFromUser = scanner.nextLine();
//        System.out.println("Please enter the distance that the sound wave will travel in this medium: ");
//        float distanceFromUser = scanner.nextFloat();
//        float time = 0;
//
//        if (mediumFromUser.equalsIgnoreCase("air")) {
//            time = distanceFromUser / 1100;
//        }/* please add conditions for water steel */
//
//        if (time > 0) {
//            System.out.println("The time sound needs to travel in " + mediumFromUser + " is: " + time);
//        } else {
//            System.out.println("You either entered a unknown medium, either a negative or zero distance.");
//        }