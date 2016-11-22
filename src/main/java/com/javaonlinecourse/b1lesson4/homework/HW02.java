package com.javaonlinecourse.b1lesson4.homework;

/**
 * @author emitrohin
 * @version 1.0
 *
 * В переменной x хранится n-значное число число. Создайте программу,
 * вычисляющую и выводящую на экран сумму цифр n.
 */
public class HW02 {
    public static void main(String[] args) {
        int number = 1234, summery =0;
        while (number >= 1) {
            summery = summery + number % 10;
            number = number / 10;
        }
        System.out.println(summery);
    }
}
