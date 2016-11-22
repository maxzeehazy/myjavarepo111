package com.javaonlinecourse.b2lesson2.homework.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Ввести с клавиатуры 10 чисел и заполнить ими список.
 * Используя цикл for вывести их в обратном порядке.
 */
public class HomeTask04 {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = list.size()-1; i >= 0; i--)
        {
            System.out.println(list.get(i));
        }
    }
}
