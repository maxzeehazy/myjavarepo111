package com.javaonlinecourse.b1lesson1.classwork;

import java.lang.Math;

/**
 * Математические функции в Java
 */
public class MathFunc {

    public static void main(String[] args) {
        double a;
        a = Math.sqrt(81);
        System.out.println(a);// выведет 9.0
        a = Math.pow(2,10);
        System.out.println(a);// выведет 1024.0
        a = Math.sin(Math.PI/2);
        System.out.println(a);// выведет 1.0
        a = Math.cos(Math.PI);
        System.out.println(a); // выведет -1.0
        a = Math.acos(-1);
        System.out.println(a); // выведет 3.141592653589793
        a = Math.round(Math.E);
        System.out.println(a);// выведет 3
        a = Math.abs(-6.7);
        System.out.println(a);// выведет 6.7
    }
}
