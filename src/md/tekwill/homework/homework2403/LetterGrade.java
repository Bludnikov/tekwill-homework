package md.tekwill.homework.homework2403;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please input one of the following grades: A, B, C, D or F");
        int correspondingValue = 0;

        String gradeInput = in.nextLine();
        if (gradeInput.equalsIgnoreCase("a")) {
            correspondingValue = 4;
        } else if (gradeInput.equalsIgnoreCase("b")) {
            correspondingValue = 3;
        } else if (gradeInput.equalsIgnoreCase("c")) {
            correspondingValue = 2;
        } else if (gradeInput.equalsIgnoreCase("d")) {
            correspondingValue = 1;
        } else if (gradeInput.equalsIgnoreCase("f")) {

        } else {
        System.out.println("Please input the correct grade.");
        }
        if (correspondingValue != 0) {
            System.out.println("The numeric value for " + gradeInput + " is " + correspondingValue);
        }
    }
}
