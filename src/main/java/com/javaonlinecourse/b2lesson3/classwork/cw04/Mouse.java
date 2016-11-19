package com.javaonlinecourse.b2lesson3.classwork.cw04;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class Mouse implements USB {

    void click(){
        System.out.println("Клик клик");
    }

    void move(){
        System.out.println("Шорканье мыши");
    }

    @Override
    public void sendData() {
        click();
        move();
    }

}
