package md.tekwill.homework.homework2003;

import java.util.Scanner;  // Import the Scanner class

public class ConvertTempScanner {

         public static void main(String[] args) {
            Scanner temp = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter temperature in Fahrenheit:");

            double tempFahrenheit = temp.nextInt();  // Read user input (you need to specify the input data type, int will work as it will output double)
            // double tempFahrenheit = temp.nextDouble();
            double tempCelsius = tempFahrenheit - 112.0;

             System.out.println(tempFahrenheit + " degree Fahrenheit is equal to " + tempCelsius + " in Celsius");

        }
    }


    /*
    // Java program to read data of various types using Scanner class.
import java.util.Scanner;
public class ScannerDemo1
{
	public static void main(String[] args)
	{
		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);

		// String input
		String name = sc.nextLine();

		// Character input
		char gender = sc.next().charAt(0);

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();

		// Print the values to check if the input was correctly obtained.
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Mobile Number: "+mobileNo);
		System.out.println("CGPA: "+cgpa);
	}
}

     */