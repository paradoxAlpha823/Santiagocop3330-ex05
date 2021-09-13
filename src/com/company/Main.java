/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String s1 = x.nextLine();
        Integer num1 = null;
        try {
            num1 = Integer.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }
        System.out.print("What is the second number? ");
        String s2 = x.nextLine();
        Integer num2 = null;
        try {
            num2 = Integer.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }

        int n1 = num1;
        int n2 = num2;


        int add = n1 + n2;
        int sub = n1 - n2;
        int mul = n1 * n2;
        int div = n1 / n2;

        System.out.println(n1 + " + " + n2 + " = " + add + "\r\n" + n1 + " - " + n2 + " = " + sub + "\r\n" + n1 + " * " + n2 + " = " + mul + "\r\n" + n1 + " / " + n2 + " = " + div);

        System.exit(0);
    }
}
