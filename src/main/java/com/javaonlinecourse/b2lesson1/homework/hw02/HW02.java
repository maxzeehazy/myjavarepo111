package com.javaonlinecourse.b2lesson1.homework.hw02;

/**
 * Написать метод, который выводит переданную строку на экран шесть раз, каждый раз с новой строки.
 */
public class HW02 {
    public static void test(String s)
    {
        s = "test 6";
        for (int i = 1; i < 7; i++) {
            System.out.println(s);

        }
        }

    public static void main(String[] args)
    {

        HW02.test("");

    }
}


