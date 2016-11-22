package com.javaonlinecourse.b1lesson4.homework;

import java.util.Random;

/**
 * @author emitrohin
 * @version 1.0
 *          <p>
 *          Минимум четырех чисел
 *          Написать функцию, которая вычисляет минимум из четырёх чисел.
 */
public class HW01 {

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(200),
            b = random.nextInt(200),
            c = random.nextInt(200),
            d = random.nextInt(200);
        System.out.print(a + " " + b + " " + c + " " + d);
        System.out.println(min(a, b, c, d));
    }

    public static int min(int a, int b, int c, int d) {
        // реализовать тут
        int mainMin;
        int m2 = min(a,b);
        return 0;
    }

    //опорная функция для вычисления минимума двух
    public static int min(int a, int b) {
        int min;
        if (a < b)
            min = a;
        else
            min = b;
        return min;

    }
}
