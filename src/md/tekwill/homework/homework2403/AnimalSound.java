//4. Write a Java program that reads an animal from the user and prints the sound it makes.
//Test data
//Input animal: Wolf
//Expected Output :
//Howl
//Input animal: Sheep
//Expected Output :
//Baaaa

package md.tekwill.homework.homework2403;

import java.util.Scanner;

public class AnimalSound {
    public static void main(String[] args) {

        String Lion = "RAWR";
        String Cat = "MEOW";
        String Wolf = "Principles and values";
        String Dog = "WOOF";

        Scanner animal = new Scanner(System.in);
        System.out.println("Type the name of one of the following animals to find out what sound it makes: \nLion, Cat, Wolf, Dog.");

        String animalInput = animal.nextLine();

        if (animalInput.contains("Lion"))
            System.out.println(Lion);
        else if (animalInput.contains("Cat"))
            System.out.println(Cat);
        else if (animalInput.contains("Wolf"))
            System.out.println(Wolf);
        else if (animalInput.contains("Dog"))
            System.out.println(Dog);
        else
            System.out.println("No-no-noah's ARK");

    }
}
