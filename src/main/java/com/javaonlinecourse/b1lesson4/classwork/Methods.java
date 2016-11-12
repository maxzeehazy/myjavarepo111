package com.javaonlinecourse.b1lesson4.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          12.11.2016
 */
public class Methods {

    //функция квардратного корня
    static double sqrt (double a) {
        double t = Math.pow(a, 0.5);
        return t;
    }

    static void printNumbers(double... a) {

        if (a.length == 0)
        {
            System.out.println("Нет переданных значений!");
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {

        //вызов функции квардратного корня
        double t = sqrt(5D);
        System.out.println(t);

        //печатаем последовательность цифр
        printNumbers();
        printNumbers(1.0, 5.0);
        printNumbers(1.0, 5.0, 8.0);
    }
}
