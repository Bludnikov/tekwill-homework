package md.tekwill.homework.homework0204;

public class FractionSum {
    public static void main(String[] args) {

        float x = 0;
        for (float n = 3; n < 100; n = n + 2) {
            System.out.print((n-2) + "/" + n + " + ");
            x = (n-2) / n;
        }
            System.out.println("The value of the fraction sum operation equals: " + x);

    }
}
