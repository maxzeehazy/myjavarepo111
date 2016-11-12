package com.javaonlinecourse.b1lesson1.classwork;

/**
 * Пример инкремента и декремента в Java
 */
public class Increment {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i : " + i);
        System.out.println("++i : " + ++i); // Pre-increment
        System.out.println("i++ : " + i++); // Post-increment
        System.out.println("i : " + i);
        System.out.println("--i : " + --i); // Pre-decrement
        System.out.println("i-- : " + i--); // Post-decrement
        System.out.println("i : " + i);
    }
}
