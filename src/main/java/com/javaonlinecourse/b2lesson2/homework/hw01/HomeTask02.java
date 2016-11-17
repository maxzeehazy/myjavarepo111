package com.javaonlinecourse.b2lesson2.homework.hw01;

/**
 * Задачи на преобразование целых типов
 * Расставьте правильно операторы приведения типа, чтобы получился ответ: d = 3.765
 */
public class HomeTask02 {
    public static void main(String[] args) {
        int alpha = 15;
        int beta = 4;
        float gamma = alpha / beta;
        double delta = alpha * 1e-3 + gamma;
        System.out.println(delta);
    }
}
