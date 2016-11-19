package com.javaonlinecourse.b2lesson3.classwork.cw04;

import java.io.Serializable;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public interface USB extends Serializable{

    int NO = 1;
    int NOO = 2;

    void sendData();

    static int test()
    {
        return 0;
    }

    default void receiveData(USB pluggable) throws Exception
    {
        throw new Exception("Не поддерживается");
    }
}
