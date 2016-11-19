package com.javaonlinecourse.b2lesson3.classwork.cw04;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class Human implements Movable {

    String action = "Иду пешком ";

    @Override
    public void moveRight() {
        System.out.println(action + "направо");
    }

    @Override
    public void moveLeft() {
        System.out.println(action + "налево");
    }

    @Override
    public void moveForward() {
        System.out.println(action + "прямо");
    }

    @Override
    public void moveBackward() {
        System.out.println(action + "назад");
    }
}
