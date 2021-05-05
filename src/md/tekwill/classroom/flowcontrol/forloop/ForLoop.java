package md.tekwill.classroom.flowcontrol;

public class ForLoop {
    public static void main(String[] args) {
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Sending mail number: " + (counter + 1));
            System.out.println("Mail sent...");
        }
    }
}
