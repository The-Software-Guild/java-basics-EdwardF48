package com.sg.foundations.assessments;
import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = Integer.parseInt(userInput.nextLine());
        System.out.println("Your maximum heart rate should be " + (220-age) + " beats per minute");
        System.out.println("Your target HR Zone is " + 0.5*(220-age) + " - " + 0.85*(220-age) + " beats per minute");
    }
}
