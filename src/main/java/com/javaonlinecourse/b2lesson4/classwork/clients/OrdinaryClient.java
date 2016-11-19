package com.javaonlinecourse.b2lesson4.classwork.clients;

import java.util.Random;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class OrdinaryClient extends Client{
    public OrdinaryClient() {
        Random random = new Random();
        money = random.nextInt(50000);
    }
}
