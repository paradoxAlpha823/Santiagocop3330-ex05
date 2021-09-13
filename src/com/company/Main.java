/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int n1 = x.nextInt();
        System.out.print("What is the second number? ");
        int n2 = x.nextInt();

        int add = n1+n2;
        int sub = n1-n2;
        int mul = n1*n2;
        int div = n1/n2;

        System.out.println(n1+" + "+n2+" = "+add+"\r\n"+n1+" - "+n2+" = "+sub+"\r\n"+n1+" * "+n2+" = "+mul+"\r\n"+n1+" / "+n2+" = "+div);
    }
}
