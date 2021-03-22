package md.tekwill.homework.homework2003;

public class ComparisonOp {
    public static void main(String[] args) {
        int a = 18;
        int b = 22;
        int c = 30;

            System.out.println(++a > 18 || b++ < 10);
            //
            System.out.println(b-- > 30 && a++ <=19);
            //
            System.out.println(c++ > a && a < b || c++ < 30);
            //
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);

    }
}