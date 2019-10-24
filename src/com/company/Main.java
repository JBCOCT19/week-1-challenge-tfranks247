package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(2000);
        //capture the input in an integer
        int i, m = 0, flag = 0;
        int num = scan.nextInt();
        scan.close();
        m = num / 2;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + "" + " is prime number");
            }
        }


        int i2, m2 =0, flag2 =0;

        m2 = randomNumber / 2;
        if (randomNumber == 0||randomNumber == 1) {
            System.out.println("Random number " + randomNumber + " is not prime number");
        } else {
            for (i2 = 2; i2 <= m2; i2++) {
                if (randomNumber % i2 == 0) {
                    System.out.println("Random number " + randomNumber + " is not prime number ");
                    flag2 = 1;
                    break;
                }
            }
            if (flag2 == 0) {
                System.out.println("Random number " + randomNumber + "" + " is a prime number");
            }
        }
    }
}



