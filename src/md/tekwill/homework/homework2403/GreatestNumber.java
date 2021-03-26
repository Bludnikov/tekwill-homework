//2. Take three numbers from the user and print the greatest number.
//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
//Expected Output :
//The greatest: 87

package md.tekwill.homework.homework2403;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Introduce first number: ");
        int firstNumber = number.nextInt();

        System.out.println("Introduce second number: ");
        int secondNumber = number.nextInt();

        System.out.println("Introduce third number: ");
        int thirdNumber = number.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber)
            System.out.println(firstNumber + " is the Greatest Number");

        else if (secondNumber > firstNumber && secondNumber > thirdNumber)
            System.out.println(secondNumber + " is the Greatest Number");

        else //if (thirdNumber >firstNumber && thirdNumber > secondNumber)
            System.out.println(thirdNumber + " is the Greatest Number");


    }
}
