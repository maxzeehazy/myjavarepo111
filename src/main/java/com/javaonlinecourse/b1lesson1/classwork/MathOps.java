package com.javaonlinecourse.b1lesson1.classwork;

import java.util.Random;

/**
 * Пример использования математических операторов в Java
 */
public class MathOps {
    public static void main(String[] args) {
        // Создание и раскрутка генератора случайных чисел:
        Random rand = new Random(47);
        int i, j, k;
        // Случайно 1 до 100:
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);
        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = k / j;
        System.out.println("k / j : " + i);
        i = k * j;
        System.out.println("k * j : " + i);
        i = k % j;
        System.out.println("k % j : " + i);
        // Тесты для вещественных чисел:
        double u, v, w;
        v = rand.nextDouble();
        System.out.println("v : " + v);
        w = rand.nextDouble();
        System.out.println("w : " + w);
        u = v + w;
        System.out.println("v + w : " + u);
        u = v - w;
        System.out.println("v - w : " + u);
        u = v * w;
        System.out.println("v * w : " + u);
        u = v / w;
        System.out.println("v / w : " + u);
        // следующее также относится к типам 
        // char, byte, short, int. long и double:
        u += v;
        System.out.println("u += v : " + u);
        u -= v;
        System.out.println("u -= v : " + u);
        u *= v;
        System.out.println("u *= v : " + u);
        u /= v;
        System.out.println("u /= v : " + u);
    }
}
