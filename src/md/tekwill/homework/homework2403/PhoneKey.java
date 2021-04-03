package md.tekwill.homework.homework2403;

import java.util.Scanner;

public class PhoneKey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please introduce a letter!");
        String letter = in.nextLine();
        int correspondingNumber = 0;


        if (letter.equalsIgnoreCase(" ")) {
            correspondingNumber = 1;
        } else if (letter.equalsIgnoreCase("a")
                || letter.equalsIgnoreCase("b")
                || letter.equalsIgnoreCase("c")) {
            correspondingNumber = 2;
        } else if (letter.equalsIgnoreCase("d")
                || letter.equalsIgnoreCase("e")
                || letter.equalsIgnoreCase("f")) {
            correspondingNumber = 3;
        } else if (letter.equalsIgnoreCase("g")
                || letter.equalsIgnoreCase("h")
                || letter.equalsIgnoreCase("i")) {
            correspondingNumber = 4;
        } else {
            System.out.println("You should input just a single valid letter");
        }

        if(correspondingNumber !=0) {
            System.out.println("The corresponding number is:" + correspondingNumber);

        }
    }
}
