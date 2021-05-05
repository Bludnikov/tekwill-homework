package md.tekwill.classroom.flowcontrol.whileloop;

import java.util.ArrayList;

public class NestedLIstExample {
    public static void main(String[] args) {
        ArrayList<String> exams = new ArrayList<>();
        exams.add("Java");
        exams.add("Oracle");
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Basic");
        levels.add("Advanced");
        ArrayList<String> grades = new ArrayList<>();
        grades.add("Passed");
        grades.add("Failed");

        ArrayList<ArrayList<String>> nestedList = new ArrayList<>();
        nestedList.add(exams);
        nestedList.add(levels);
        nestedList.add(grades);

        for (int examIndex = 0; examIndex < exams.size(); ++examIndex) {
            for (int levelIndex = 0; levelIndex < levels.size(); ++levelIndex) {
                for (int gradesIndex = 0; gradesIndex < grades.size(); ++gradesIndex) {
                    System.out.println("Exam: " + exams.get(examIndex));
                    System.out.println("Level: " + levels.get(levelIndex));
                    System.out.println("Grade: " + grades.get(gradesIndex));
                }
            }
        }
        for (ArrayList<String> nestedListElement :nestedList) {
            for (String element: nestedListElement) {
                System.out.println(element);
            }
        }
    }
}
