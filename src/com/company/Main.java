package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you if it is in the Fibonacci Sequence.");
        int input = kb.nextInt();


    }

    public class fibo{
        int q = 1;
        int w = 1;
        int e;

        int n = 0;
        int arr [] = new int[100];
/*
        public  int test( int a, int b, int c){
            if (e>1000){
            return 1;
            }
            else {
                e = q + w;
                q = w;
                w = e;
                e = arr[n];
                n++;
                test(a, b, c);
                return 1;
            }
*/

        int n1=0,n2=1,n3=0;
        void printFibonacci(int count){
            if(count>0){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" "+n3);
                printFibonacci(count-1);
            }
        }
    }
    }
}
