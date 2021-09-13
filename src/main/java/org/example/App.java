package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App {
    public static void main(String[] args) {
        String peopleString;
        String pizzasString;
        String quotientString;
        String remainderString;
        Scanner askNumPeople = new Scanner(System.in);
        System.out.println("How many people? ");

        String inputNumPeopleS = askNumPeople.nextLine();
        if (inputNumPeopleS.isEmpty()) {
            System.out.println("Number of people is required!");
        } else {
            int inputNumPeople = parseInt(inputNumPeopleS);
            Scanner askNumPizzas = new Scanner(System.in);
            System.out.println("How many pizzas do you have? ");
            String inputNumPizzasS = askNumPizzas.nextLine();
            if (inputNumPizzasS.isEmpty()) {
                System.out.println("Number of pizzas is required!");
            } else {
                int inputNumPizzas = parseInt(inputNumPizzasS);
                Scanner askNumSlices = new Scanner(System.in);
                System.out.println("How many slices per pizza? ");
                String inputNumSlicesS = askNumSlices.nextLine();
                if (inputNumSlicesS.isEmpty()) {
                    System.out.println("Number of slices is required!");
                } else {
                    int inputNumSlices = parseInt(inputNumSlicesS);
                    int totalSlices = inputNumPizzas * inputNumSlices;
                    int slicesPerQuotient = totalSlices / inputNumPeople;
                    int slicesPerRemainder = totalSlices % inputNumPeople;
                    if (inputNumPeople == 1) {
                        peopleString = " person";
                    }
                    else {
                        peopleString = " people";
                    }
                    if (inputNumPizzas == 1) {
                        pizzasString = " pizza";
                    }
                    else {
                        pizzasString = " pizzas";
                    }
                    if (slicesPerQuotient == 1) {
                        quotientString = " piece of pizza.";
                    }
                    else {
                        quotientString = " pieces of pizza.";
                    }
                    if (slicesPerRemainder == 1) {
                        remainderString = String.format(" is %d leftover piece.", slicesPerRemainder);
                    }
                    else {
                        remainderString = String.format(" are %d leftover pieces.", slicesPerRemainder);
                    }
                    System.out.println(inputNumPeople + peopleString + " with " + inputNumPizzas + pizzasString + " (" + totalSlices + " slices)\n" + "Each person gets " + slicesPerQuotient + quotientString + "\n" + "There" + remainderString);
                }
            }
        }
    }
}
