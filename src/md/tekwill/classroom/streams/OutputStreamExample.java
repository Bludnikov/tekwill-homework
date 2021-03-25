package md.tekwill.classroom.streams;

public class OutputStreamExample {
    public static void main(String[] args) {
        int a = 100;
        int b = 345;
        System.out.println("The addition of ");
        System.out.println(a + " and " + b + " equals = "); //Since a is an int (i.e. number) in the beginning, + is addition, then switches to concatenation.
        System.out.println(a + b); // Since both values are numbers, + just sums them

        System.out.println("Here you go with String " + "concatination");
    }
}
