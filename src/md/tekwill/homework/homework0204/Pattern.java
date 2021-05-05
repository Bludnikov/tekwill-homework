package md.tekwill.homework.homework0204;

public class Pattern {
    public static void main(String[] args) {

        for (int row = 1; row <= 6; ++row) {
            for (int column = 1; column <= row; ++column) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern A");
        System.out.println();

        for (int row = 6; row >= 1; --row) {
            for (int column = 1; column <= row; ++column) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern B");
        System.out.println();

        for (int row = 1; row <= 6; ++row) {
            for (int column = 1; column <= 6 - row; ++column) {
                System.out.print("  ");
            }
            for (int column = row; column > 0; --column) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern C");
        System.out.println();

        for (int row = 1; row <= 6; ++row) {
            for (int column = 1; column <= row; ++column) {
                System.out.println(" ");
            }
            for (int column = row; column > 0; --column) {
                System.out.print(column + " ");
            }

            System.out.println();
        }
        System.out.println("Pattern D");
        System.out.println();
    }

}



