package com.javaonlinecourse.b2lesson3.classwork.cw04;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class DeathStar implements USB {
    @Override
    public void sendData() {
        System.out.println("Вам хана!");
    }

    @Override
    public void receiveData(USB pluggable) {

    }
}
