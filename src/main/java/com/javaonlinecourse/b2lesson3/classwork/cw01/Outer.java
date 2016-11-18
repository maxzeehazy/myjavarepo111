package com.javaonlinecourse.b2lesson3.classwork.cw01;

/**
 * @author emitrohin
 * @version 1.0
 *          18.11.2016
 */
public class Outer {
    int outer_x = 100;

    void test() {

    }
    //Внутренний класс
    class Inner {
        void display() {
            System.out.println("вывод: outer_x " + outer_x);
        }
    }

}
