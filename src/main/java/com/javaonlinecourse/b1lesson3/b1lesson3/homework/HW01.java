package com.javaonlinecourse.b1lesson3.b1lesson3.homework;

/**
 * @author emitrohin
 * @version 1.0
 *
 * Создайте массив из всех чётных чисел от 2 до 20.
 */
public class HW01 {
    public static void main(String[] args) {
        int count = 0; //индекс массива
        int n = 2; //значение индекса массива
        while (n < 20) { //на выходе из этого цикла имеем count когда в него записано 20
            count++;
            n = n + 2;
        }
        int[] massiv = new int[count]; //объявляем массив
        int number = 2; //начальное значение ячейки с индексом 0
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = number;
            number = number + 2;
            System.out.print(massiv[i] + " ");

        }
    }
}