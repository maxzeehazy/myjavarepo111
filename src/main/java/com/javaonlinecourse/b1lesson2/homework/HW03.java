package com.javaonlinecourse.b1lesson2.homework;

/**
 * Число 6 воистино великолепно.
 * Даны два числа a and b, вычислить true если одно из них 6.
 * Или их разница равна 6. На заметку: Math.abs(num)
 * возвращает число по модулю.
 */
public class HW03 {
    public static void main(String[] args) {
        int a, b, c;
        a = 6;
        b = 12;

        c = a-b;
        boolean y = Math.abs(c) == 6 ;


        System.out.println(y);


    }
}
