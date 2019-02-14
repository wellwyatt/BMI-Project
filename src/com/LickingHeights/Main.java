package com.LickingHeights;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        double userInches, userFeet, userWeight;
        //BMI = kg/m*m
        double lowNormal, highNormal,
                highBMI;

        lowNormal = 18.4;
        highNormal = 24.9;
        System.out.println("What is your height? (in feet)");
        userFeet = keyboard.nextInt();


        System.out.println("What is your height? (in inches)");
        userInches = keyboard.nextInt();
        userInches = (userFeet * 12 + userInches);

        System.out.println("What is your weight? (in lbs)");
        userWeight = keyboard.nextInt();


        System.out.println("Your BMI is ");
        double BMI = (userWeight * 703) / (userInches * userInches);
        System.out.println
                (BMI+",");

        if (BMI >= lowNormal && BMI < highNormal)
            System.out.println(" Your BMI is Normal.");

        else if (BMI < lowNormal)
            System.out.println(" Your BMI is low");

        else if (BMI>highNormal)
            System.out.println (" Your BMI is High.");

    }
}
