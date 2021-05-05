package md.tekwill.homework.homework0204;

public class SquareRoot {
    public static void main(String[] args) {
            float x = 0;
        for (float n = 1; n < 625; n++) {
            System.out.print("1" + "/" + Math.sqrt(n) + " + " + Math.sqrt(++n));
            x += (float) (1/((Math.sqrt(n)+Math.sqrt(n++))));
        }
        System.out.println("\n");
        System.out.println("The value of the squared function equals: " + x);
    }
}