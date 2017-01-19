package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you if it is in the Fibonacci Sequence.");
        int input = kb.nextInt();
        System.out.println("Here is the sequence.");
        fibo.printFibonacci(input);


    }

    public static class fibo{

        static int q = 0;
        static int w = 1;
        static int x = 0;
        static int count = 0;
        static void printFibonacci(int input){
            x = q + w;
            q = w;
            w = x;
            if (count == 0){
                System.out.print(w + ", " + w + ", " + "2");
            }
            if (count > 1) {
                System.out.print(", " + w);
            }
            count++;
            if (input == w){
                System.out.println("\nCongratulations! Your number is in the Fibonacci Sequence");
            }
            else if (input != w) {
                if(count < 20) {
                    printFibonacci(input);
                }
                else {
                    System.out.println("\nSorry, your number is not in the Fibonacci Sequence.");
                }
            }
        }
    }
}
