package com.javaonlinecourse.b1lesson3.b1lesson3.homework;

/**
 * @author emitrohin
 * @version 1.0
 *
 * Создайте массив из всех нечётных чисел от 1 до 99.
 * выведите на экран тоже в строку в
 * обратном порядке (99 97 95 93 … 7 5 3 1).
 */
public class HW02 {
    public static void main(String[] args) {
        int min = 1,
                max = 99,
                count = -1;
        int [] arr = new int[max%2==0 ? max/2 : max/2+1];
//
        String strSorted = "",
                strReversed = "";

//
        while(count < arr.length-1)
        {
            arr[++count] = min;
            strSorted += min +" ";
            strReversed = min +" "+ strReversed;
            min += 2;
        }
        System.out.println(strReversed);

    }
}
