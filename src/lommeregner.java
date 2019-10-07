package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv et tal");
        int a = input.nextInt();
        System.out.println("Skriv andet tal du vil regne med");
        int b = input.nextInt();
        System.out.println("Vælg operation (Minus, gange, plus, dividere)");
        String operator = input.nextLine();
        operator = input.nextLine();
        System.out.println(operator);
        if (operator.equals("+")){
            System.out.println("Resultatet er " + (a + b));
        }
        else if (operator.equals("-"))
        {
            System.out.println("Resultatet er " + (a - b));
        }
        else if (operator.equals("/"))
        {
            System.out.println("Resultatet er " + (a / b));
        }
        else if (operator.equals("*"))
        {
            System.out.println("Resultatet er " + (a * b));
        }
        else System.out.println("Du er spasser");

    }
}