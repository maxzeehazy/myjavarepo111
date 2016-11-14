package com.javaonlinecourse.b1lesson2.homework;

/**
 * logic
 * Когда белки собираются устроить вечирику, они берут с собой сигары.
 * Вечиринка проходит успешно, если количество сигар больше 40, но меньше 60 влючительно.
 * Как известно вечеринки устраивают по выходным, но если поэтому по будням лимитов на сигары на вечеринки нет.
 * Реализовать метод логику, которая проверит успешность вечиринки.
 */
public class HW01 {
    public static void main(String[] args) {

        int quantity;
        quantity = 40;
        boolean weekdays = true,a, b;
        a = true;
        b = false;


        if (quantity >= 40 & quantity <= 59 & weekdays)
        {
            System.out.println(a);

        }
        else if  (quantity <= 40)
        {
            System.out.println(b);

        }
        if (quantity >= 60)
        {
            System.out.println(b);
        }

    }
}