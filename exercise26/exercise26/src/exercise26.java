/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.Scanner;
import static java.lang.Math.log;

public class exercise26 {


    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance?");
        double balance = input.nextDouble();

        System.out.println("What is the APR on the card (as a percent)?");
        double APR = input.nextDouble();
        APR = APR / 100 / 365;

        System.out.println("What is the monthly payment you can make?");
        double monthlyPayment = input.nextDouble();

        double answer;
        answer = PaymentCalculator.calculateMonthsUntilPaidOff(balance, APR, monthlyPayment);

        System.out.println("It will take you " + (int)Math.ceil(answer) + " months to pay off this card.");


    }


    class PaymentCalculator {
        public static double calculateMonthsUntilPaidOff(double balance, double APR, double monthlyPayment) {
            double months;
            months = -(1.000000 / 30.000000) * (log(1 + (balance / monthlyPayment) * (1 - java.lang.Math.pow((1 + APR), 30)))) /log(1 + APR);

            return months;
        }
    }
}


