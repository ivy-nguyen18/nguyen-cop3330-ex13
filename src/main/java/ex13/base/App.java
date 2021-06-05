/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex13.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double principal = input.nextDouble();
        System.out.print("What is the rate? ");
        double rate = input.nextDouble();
        System.out.print("What is the number of years? ");
        int years = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int compounded = input.nextInt();

        CompoundInterest interest = new CompoundInterest(principal, rate, years, compounded);

        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f.",
                principal, rate, years, compounded, interest.investment());

    }
}

