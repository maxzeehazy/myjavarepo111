package com.javaonlinecourse.b2lesson2.classwork.shadowing;

/**
 * Created by E_Mitrohin on 17.11.2016.
 */
public class B extends A{
    String x = "Класс А";

    void printB() {
        System.out.println(x);
        System.out.println("Вывов из класса В " + ((A)this).x);
    }

}
