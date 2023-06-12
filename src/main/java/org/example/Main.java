package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int k = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                k += i;
            }
        }

        if (k == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }

    }
}