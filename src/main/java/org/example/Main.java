package org.example;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        System.out.println(x <= y);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        //IF STATEMENTS
        int temp = 32;
        if(temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink Water");
        } else if (temp > 20) {
            System.out.println("Beautiful day!");
        }
        else {
            System.out.println("Cold day!");
        }

        int income  = 120_000;
        hasHighIncome = (income > 100_000);

        String className = income > 100_000 ? "First" : "Economy";


        //SWITCH - CASE STATEMENTS
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
            default:
                System.out.println("You're a guest");
        }

         //
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 5 == 0){
            if(number % 3 == 0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println("Fizz");
            }
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else{
            System.out.println(number);
        }

        //WHILE LOOPS
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(true){
            System.out.println("Input: ");
            input = sc.next().toLowerCase();
            if (input.equals("pass")){
                continue;
            }
            if (input.equals("quit")){
                break;
            }
            System.out.println(input);
        }

        //FOR EACH LOOP
        String fruits[] = {"Apple", "Mango", "Orange"};

        for (int i = fruits.length - 1; i > 0; i--) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}