package md.tekwill.classroom.streams;

import java.util.Scanner;

public class FusionExample {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How are you " + name + " ?");
        String answer = scanner.nextLine();

        if (answer.contains("fine"))
            System.out.println("Fine! It means you can continue with your JavaPadawan training for a few more hundred years!");
        else if (answer.contains("great"))
            System.out.println("Great! It means you can continue with your JavaPadawan training till you die!");
        else if (answer.contains("bad"))
            System.out.println("Sorry to hear that, but you still need to continue your JavaPadawan training, you whiny wiener!");
        else
            System.out.println("Oopsy daisy! This means you have to go back to training!");

    }
}
