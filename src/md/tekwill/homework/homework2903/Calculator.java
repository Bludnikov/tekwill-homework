package md.tekwill.homework.homework2903;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int inUser1 = in.nextInt();

        System.out.println("Please enter the second number:");
        int inUser2 = in.nextInt();

        System.out.println("Please enter the operator:");
        String operator = in.nextLine();

        switch(operator) {
            case "*":
                System.out.println(inUser1 + " * " + inUser2 + " = " + (inUser1 + inUser2));
                break;
            case "/":
                System.out.println(inUser1 + " / " + inUser2 + " = " + (inUser1 / inUser2));
                break;
            case "+":
                System.out.println(inUser1 + " + " + inUser2 + " = " + (inUser1 + inUser2));
                break;
            case "-":
                System.out.println(inUser1 + " - " + inUser2 + " = " + (inUser1 - inUser2));
                break;
        }

    }
}
