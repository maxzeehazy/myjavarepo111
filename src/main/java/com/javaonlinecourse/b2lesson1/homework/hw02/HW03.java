package com.javaonlinecourse.b2lesson1.homework.hw02;

/**
 * Реализовать метод, который воводит на экран сумму чисел от 1 до n построчно.
 * 1
 * 1+2=3
 * 1+2+3=6
 * 1+2+3+4=10
 * 1+2+3+4+n=…
 * …
 * Пример вывода:
 * 1
 * 3
 * 6
 * 10
 * …
 */
public class HW03 {

    public static void main(String[] args) {

        sum(5);
    }

    public static void sum (int n) {

        int sum = 0;

        for (int i = 1; i <= n ; i++) {

            sum += i;

            System.out.println(sum);

        }

    }

}



