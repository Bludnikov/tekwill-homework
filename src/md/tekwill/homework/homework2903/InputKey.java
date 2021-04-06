package md.tekwill.homework.homework2903;

import java.util.Scanner;

public class InputKey {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a key from \"a\" to \"j\":");

        String keyInput = key.nextLine();

        switch (keyInput) {
            case "a":
                System.out.println("You pressed" +  " " + "\"a\"" +  " " + "character");
                break;
            case "b":
                System.out.println("You pressed" +  " " + "\"b\"" +  " " + "character");
                break;
            case "c":
                System.out.println("You pressed" +  " " + "\"c\"" +  " " + "character");
                break;
            case "d":
                System.out.println("You pressed" +  " " + "\"d\"" +  " " + "character");
                break;
            case "e":
                System.out.println("You pressed" +  " " + "\"e\"" +  " " + "character");
                break;
            case "f":
                System.out.println("You pressed" +  " " + "\"f\"" +  " " + "character");
                break;
            case "g":
                System.out.println("You pressed" +  " " + "\"g\"" +  " " + "character");
                break;
            case "h":
                System.out.println("You pressed" +  " " + "\"h\"" +  " " + "character");
                break;
            case "i":
                System.out.println("You pressed" +  " " + "\"i\"" +  " " + "character");
                break;
            case "j":
                System.out.println("You pressed" +  " " + "\"j\"" +  " " + "character");
                break;
        }

    }
}
