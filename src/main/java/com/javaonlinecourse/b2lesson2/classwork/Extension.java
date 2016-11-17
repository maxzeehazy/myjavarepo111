package com.javaonlinecourse.b2lesson2.classwork;

/**
 * Created by E_Mitrohin on 17.11.2016.
 */
public class Extension {

    static class Figure {

    }
    static class Box extends Figure{

    }

    public static void main(String[] args) {
        //вот так правильно
        Box box = new Box();
        Figure figure = new Figure();
        Figure figure2 = new Box();

        //Box badBox = new Figure(); //Ошибка!
    }


}
