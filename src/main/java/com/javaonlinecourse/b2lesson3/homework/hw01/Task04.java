package com.javaonlinecourse.b2lesson3.homework.hw01;

import com.sun.javafx.tk.Toolkit;

/**
 * @author emitrohin
 * @version 1.0
 *
 * Создай класс Car.
 *
 * Реализуй в нем интерфейсы
 * Movable с методом onMove,
 * Breakable с методом onBreak.
 */

public class Task04 implements Movable {

    static String  action = "Еду на автомобиле";



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

