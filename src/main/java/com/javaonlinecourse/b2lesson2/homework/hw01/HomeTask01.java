package com.javaonlinecourse.b2lesson2.homework.hw01;

/**
 * Задачи на преобразование целых типов
 * Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
 */
public class HomeTask01 {
    public static void main(String[] args) {
        int alpha = 0;
        int beta = (byte) alpha + 51;
        byte gamma = (byte) (alpha * beta);
        double delta = (char) 1234.15;
        long epsilon = (char) (alpha + delta / gamma + beta);
        System.out.println(epsilon);
    }
}
