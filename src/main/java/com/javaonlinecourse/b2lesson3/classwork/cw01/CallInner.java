package com.javaonlinecourse.b2lesson3.classwork.cw01;

/**
 * @author emitrohin
 * @version 1.0
 *          18.11.2016
 */
public class CallInner {
    public static void main(String[] args) {
        Outer.Inner innerCall = new Outer().new Inner();
    }
}
