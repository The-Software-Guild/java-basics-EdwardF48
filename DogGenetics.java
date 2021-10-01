package com.sg.foundations.assessments;
import java.util.Scanner;
import java.util.Random;

public class DogGenetics {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random rng = new Random();
        String name;
        int totalSoFar = 0;
        int number;
        String[] dogs = {"St Bernard", "Labrador", "Husky","Poodle","Pug"};

        System.out.println("What is your dog's name?");
        name = userInput.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name +"'s prestigious background right here.");
        System.out.println();
        System.out.println(name + " is:");
        System.out.println();
        for(int n=0; n<=3; n++){
            //Ensures each has atleast 1%
            number = rng.nextInt(95+n-totalSoFar) + 1;
            totalSoFar += number;
            System.out.println(number + "% "+ dogs[n]);
        }
        System.out.println((100-totalSoFar) + "% "+ dogs[4]);
        System.out.println("Wow, that's QUITE the dog!");
    }
}
