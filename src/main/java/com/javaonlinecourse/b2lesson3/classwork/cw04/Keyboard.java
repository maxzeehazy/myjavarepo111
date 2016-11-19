package com.javaonlinecourse.b2lesson3.classwork.cw04;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class Keyboard implements USB{

    @Override
    public void sendData() {
        System.out.println("Кто-то усиленно набирает текст");
    }
}
