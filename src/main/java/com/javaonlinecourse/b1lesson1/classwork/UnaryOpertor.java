package com.javaonlinecourse.b1lesson1.classwork;

/**
 * Пример унарных операторов
 */
public class UnaryOpertor {
    public static void main(String[] args) {
        int x = -3;
        int y = +3;
        int z = -(y + 6);
        x = -(3) + +(69);
        z = -(-(-(0)));
        y = +(-9 + (+(-(+9))));
    }
}
