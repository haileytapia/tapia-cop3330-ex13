/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int principal, numYears, numCompoundPerYear;
        double rateOfInterest, compoundInterest;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        principal = input.nextInt();

        System.out.print("What is the rate? ");
        rateOfInterest = input.nextDouble();

        System.out.print("What is the number of years? ");
        numYears = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        numCompoundPerYear = input.nextInt();

        compoundInterest = Math.pow(1 + ((rateOfInterest / 100) / numCompoundPerYear), numCompoundPerYear * numYears);
        compoundInterest = principal * compoundInterest;

        System.out.print("$" + principal + " invested at " + rateOfInterest + "% for " + numYears + " years compounded " + numCompoundPerYear + " times per year is $" + Math.round(compoundInterest * 100.0) / 100.0 + ".");
    }
}