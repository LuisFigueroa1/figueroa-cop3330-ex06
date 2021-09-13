package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 06 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility
import java.util.Calendar; //calendar utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used
        String currAge; //current age
        String retAge; //retirement age

        System.out.println("What is your current age? "); //prompt current age input
        currAge = userInput.nextLine(); //scan the input
        System.out.println( "At what age would you like to retire? " ); //prompt retirement age input
        retAge = userInput.nextLine();

        //change into integers
        int currAgeInt = Integer.parseInt(currAge);
        int retAgeInt = Integer.parseInt(retAge);

        int remYears = retAgeInt - currAgeInt; //retirement operation

        int year = Calendar.getInstance().get(Calendar.YEAR); //get current year

        int retYear = year + remYears;

        //print output
        System.out.println("You have " + remYears + " years left until you can retire."
        + "\n" + "It's " + year + ", so you can retire in " + retYear + ".");
    }
}
