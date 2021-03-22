package md.tekwill.homework.homework2003;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a =7;
        //             8 -  7  + 7   +   9 - 9   -   7 - 7   +   9
        //            prI   prD  poI   prI   poD    prD  poI    prI
        int result = ++a - --a + a++ + ++a - a-- - --a - a++ + ++a;

        System.out.println("Result = " + result);
    }
}
