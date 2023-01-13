package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

    static void show(int num) {
        int f1, f2 = 0, f3 = 1;
        for (int i = 1; i < num; i++) {
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n > 0) {
            show(n);
        }
        else {
            System.out.println("please enter positive number");
        }
    }
}

