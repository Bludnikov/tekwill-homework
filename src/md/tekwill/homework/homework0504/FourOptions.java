package md.tekwill.homework.homework0504;

import java.util.Scanner;

public class FourOptions {
    public static void main(String[] args) {
        System.out.println("Please enter one of the following choices:");
        System.out.println("a) animal       b) biotope");
        System.out.println("c) conundrum    d) differential");

        Scanner in = new Scanner(System.in);

        String userInput = in.nextLine();
        switch (userInput) {
            case "a":
                System.out.println("Animals are multicellular eukaryotic organisms that form the biological kingdom Animalia");
                break;
            case "b":
                System.out.println("A biotope is an area of uniform environmental conditions providing a living place for a specific assemblage of plants and animals");
                break;
            case "c":
                System.out.println("A conundrum is a confusing and difficult problem or question");
                break;
            case "d":
                System.out.println("A differential is a gear train with three shafts that has the property that the rotational speed of one shaft is the average of the speeds of the others, or a fixed multiple of that average.");
                break;
            default:
                System.out.println("Please enter one of the offered options");
        }
    }
}
