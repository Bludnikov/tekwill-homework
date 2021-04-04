package md.tekwill.homework.homework2603;

import java.util.Scanner;

public class ISP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the type of your package, \"A\", \"B\" or \"C\"");
        String userPackage = in.nextLine();
        System.out.println(("Please input the used number of hours:"));
        float userHours = in.nextFloat();
        float bill = 0;

        if (userHours > 0) {
            if (userPackage.equalsIgnoreCase("A")) {
                bill = userHours <= 10f
                        ? 9.95f
                        : 9.95f + ((userHours - 10) * 2);

            } else if (userPackage.equalsIgnoreCase("B")) {
                bill = userHours <= 20f
                        ? 13.95f
                        : 13.95f + ((userHours - 20));
            } else if (userPackage.equalsIgnoreCase("C")) {
                bill = 19.95f;
            }
            if (bill>0) {
                System.out.println("The final bill for this month is " + bill);
            }
            else {
                System.out.println("The input data is incorrect");
            }

        }

    }
}
