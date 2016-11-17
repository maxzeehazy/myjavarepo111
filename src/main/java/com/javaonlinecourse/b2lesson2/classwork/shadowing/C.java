package com.javaonlinecourse.b2lesson2.classwork.shadowing;

/**
 * Created by E_Mitrohin on 17.11.2016.
 */
public class C extends B{
    String x = "Класс Gorbachev";

    void printC() {
        System.out.println(x);
        System.out.println("Вывов из класса Gorbachev " + ((A)this).x);
        System.out.println("Вывов из класса Gorbachev " + ((B)this).x);
    }
}
