/*
This program asks the user for the number the program will factor.
The program prints out the original number and the factor of each number.
This program also prints out the total number of factors for the number and whether or not the number is perfect.
The program also prints out whether or not the number is prime.

-A perfect number is a number where all the factors of the number, excluding the number itself, add up to that number.
-A prime number is defined as a number greater than 1 that has only itself and 1 as factors.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What number would you like to factor? ");

        Scanner scan = new Scanner(System.in);
        String chosenNumber = scan.nextLine(); // stores user's response to question.
        System.out.println("Chosen number: "+ chosenNumber);
        int finalChosenNumber = Integer.parseInt(chosenNumber); // convert user's answer to int data type so it can be used in conditional statement.

        System.out.println("The factors of " + chosenNumber + " are: ");

        int [] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12}; //array of potential factors for user's chosen number.

        int totalNumFactors = 0;
        List<Integer> factorList = new ArrayList<>(); // Created empty ArrayList to store list of factors for user's chosen number. Arraylists are resizable


        // for loop loops through each element in the numbers array and evaluates each element.
        for (int i = 1; i< numbers.length; i++) {
            if (finalChosenNumber % i == 0) {
                    factorList.add(i);
                    totalNumFactors += 1; //keeps track of the number of numbers that are factors of user's chosen number

               // System.out.println(i);
            }
        }
        System.out.println(factorList);
        System.out.println(chosenNumber + " has " + totalNumFactors + " factors."); // prints number of factors that are a factor of user's chosen number.

        /*for loop to iterate through factorList arraylist that contains all factors of user's
        chosen number.
         */

        int sumFactors = 0;
        for(int j = factorList.get(0); j<factorList.size();j++){
            sumFactors+=j; // will add all numbers in arraylist together with each iteration.
        } // conditional statement to evaluate whether user's chosen number is a perfect number.
        if (sumFactors == finalChosenNumber){
            System.out.println(finalChosenNumber+ " is a perfect number.");
        } else{
            System.out.println(finalChosenNumber+ " is not a perfect number.");
        }

        /*
        -ArrayList called primeNumberList contains 1 and user's chosen number.
        -This list will be used to evaluate whether user's chosen number is a prime number.
        -A prime number is defined as a number that is greater than 1 and only has 1 and itself as a factor.
         */
        List<Integer> primeNumberList = new ArrayList<>();
        primeNumberList.add(1); // adds 1 to primeNumberList
        primeNumberList.add(finalChosenNumber); // adds user's chosen number to primeNumberList

        //conditional statement to evaluate whether user's chosen number is greater than 1 and whether
        //Check equality between factorList and primeNumberList to see whether user's chosen number only has 1 and user chosen number.
        if(finalChosenNumber>1 && factorList.equals(primeNumberList)){ //conditional statement that checks for equality between two array lists
            System.out.println(finalChosenNumber + " is a prime number.");
        } else {
            System.out.println(finalChosenNumber+ " is not a prime number.");
        }
    }
}