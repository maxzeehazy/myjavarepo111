package com.javaonlinecourse.b2lesson3.classwork.cw04;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class PhotoApp implements USB {

    String[] memory = { "1.jpg", "2.jpg", "3.jpg", "4.jpg"};

    void shoot(){

    }

    void charge(){

    }

    @Override
    public void sendData() {
        for (int i = 0; i < memory.length; i++) {
            System.out.println(memory[i]);
        }
    }

    @Override
    public void receiveData(USB pluggable) {
        saveData();
    }

    void saveData(){

    }
}
