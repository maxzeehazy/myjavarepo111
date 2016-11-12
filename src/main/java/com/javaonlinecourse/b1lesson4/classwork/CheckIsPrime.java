package com.javaonlinecourse.b1lesson4.classwork;

import java.util.Scanner;

/**
 * @author emitrohin
 * @version 1.0
 *          Программа ищет и выводит на экран все простые нетривиальные делители числа,
 *          введённого пользователем с клавиатуры, начиная с наибольшего из делителей,
 *          либо сообщает, что введённое число — является простым.
 */
public class CheckIsPrime {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if (sc.hasNextInt()) {
            int u = sc.nextInt();
            if (u > 0) {
                if (isPrime(u)) {
                    System.out.println("Вы ввели простое число");
                } else {
                    System.out.print("Простые делители числа: ");
                    for (int i = (int) Math.sqrt(u); i >= 2; i--) {
                        if (u % i == 0 && isPrime(i)) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Вы ввели не положительное число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
