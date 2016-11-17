package com.javaonlinecourse.b2lesson2.homework.hw01;

/**
 *  Задачи на преобразование целых типов
 *  Преобразовать тип, чтобы получался ответ: result = 9
 */
public class HomeTask03 {
    public static void main(String[] args) {
        short shortVariable = 9;
        char charVariable = '0';
        int result = (charVariable + shortVariable);
        System.out.println(result);
    }
}
