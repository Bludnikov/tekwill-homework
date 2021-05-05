package md.tekwill.classroom.flowcontrol;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachLoopHandicap {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < 3; ++i) {
            numbers[i] = i + 1;
        }
        for (int number : numbers) {
            number = 3;

            System.out.println(Arrays.toString(numbers));

            ArrayList<String> exams = new ArrayList<>();
            exams.add("Java");
            exams.add("Oracle");

            for (String exam : exams) {
                exam = exam + "Jump";
            }
            for (String exam :
                    exams) {
                System.out.println(exam);
            }
        }
    }
}
