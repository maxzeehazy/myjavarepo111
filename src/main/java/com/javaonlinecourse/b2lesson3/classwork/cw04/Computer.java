package com.javaonlinecourse.b2lesson3.classwork.cw04;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class Computer implements USB{

    public void sendData() {

    }

    public void receiveData(USB pluggable) {
        pluggable.sendData();
    }

    public static void main(String[] args) throws Exception {
        Mouse m = new Mouse();
        m.receiveData(m);
        Keyboard k = new Keyboard();
        PhotoApp p = new PhotoApp();
        DeathStar d = new DeathStar();

        Computer c = new Computer();
        c.receiveData(m);
        c.receiveData(k);
        c.receiveData(p);
        c.receiveData(d);

        USB.test();

    }
}
