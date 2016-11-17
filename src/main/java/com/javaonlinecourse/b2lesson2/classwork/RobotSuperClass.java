package com.javaonlinecourse.b2lesson2.classwork;

/**
 * Created by E_Mitrohin on 17.11.2016.
 */
public class RobotSuperClass {
    private int serialNumber;
    protected String name;

    RobotSuperClass()
    {
        System.out.println("Hi!");
    }

    RobotSuperClass(String name)
    {
        this.name = name;
        System.out.println("Hi!");
    }

}
