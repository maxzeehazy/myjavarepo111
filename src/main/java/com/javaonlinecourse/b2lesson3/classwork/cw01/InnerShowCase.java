package com.javaonlinecourse.b2lesson3.classwork.cw01;

/**
 * @author emitrohin
 * @version 1.0
 *          18.11.2016
 */
public class InnerShowCase {

    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            //Внутренний класс
            class Inner {
                void display() {
                    System.out.println("вывод: outer_x " + outer_x);
                }
            }

            Inner inner = new Inner();
            inner.display();
        }
    }
}
