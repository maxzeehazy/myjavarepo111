package com.javaonlinecourse.b2lesson2.classwork.shadowing;

/**
 * Created by E_Mitrohin on 17.11.2016.
 */
public class A {

    String x = "Класс А";

    void printA() {
        System.out.println(x);
    }

    void printX() {
        System.out.println("X =" + x);
    }

}
