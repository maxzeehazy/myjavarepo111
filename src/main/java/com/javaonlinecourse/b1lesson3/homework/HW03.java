package com.javaonlinecourse.b1lesson3.homework;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author emitrohin
 * @version 1.0
 *
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите
 * массив на экран в строку. Замените каждый элемент с нечётным индексом на
 * ноль. Снова выведете массив на экран на отдельной строке.
 *
 */
public class HW03 {
    public static void main(String[] args) {
        int[] Mas = new int[8];
        for(int i=0;i<Mas.length;i++){
            Mas[i]=(int)(Math.random()*9+1);
            System.out.print(Mas[i] +" ");
        }
        for(int i=0;i<Mas.length;i++){
            if(Mas[i]%2!=0)Mas[i]=0;
            System.out.println(Mas[i] +"");
        }
    }
}


