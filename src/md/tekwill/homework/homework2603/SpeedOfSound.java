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
