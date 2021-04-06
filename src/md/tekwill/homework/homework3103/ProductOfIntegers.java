package md.tekwill.homework.homework3103;

public class ProductOfIntegers {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 15;
        int product = 0;

        for (int i = 1; i < secondNumber; ++i) {
            product += firstNumber * i;
        }
        System.out.println("The product of all integers between " + firstNumber + " and " + secondNumber + " equals: " + product);


    }
}
