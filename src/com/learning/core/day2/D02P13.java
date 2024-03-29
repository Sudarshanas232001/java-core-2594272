package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}