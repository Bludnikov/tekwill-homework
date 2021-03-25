package md.tekwill.classroom.streams;

import java.text.DecimalFormat;

public class PiFormatterExample {
    public static void main(String[] args) {

        float pi = 3.142873F;

        String formattedPi = String.format("%.06f", pi);
        System.out.println("formatted pi with two decimals: " + formattedPi);

        DecimalFormat formatter = new DecimalFormat("#.######"); //DecimalFormat is a concrete subclass of NumberFormat that formats decimal numbers.
        formattedPi = formatter.format(pi);
        System.out.println("formatted pi with four decimals: " + formattedPi);
    }
}
