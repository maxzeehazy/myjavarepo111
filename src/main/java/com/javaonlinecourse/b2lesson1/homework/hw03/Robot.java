package com.javaonlinecourse.b2lesson1.homework.hw03;

/**
 * Created by EvilCorp on 18.11.2016.
 */

public class Robot {

    int id;
    String model;
    int numberCores;

    public Robot(int id, String model, int numberCores){

        this.id = id;
        this.model = model;
        this.numberCores = numberCores;

    }

    public double calc(double x, double y){

        double pow = Math.pow(x,y);
        return pow;

    }

    public static void main(String[] args) {

        int x = 2;
        int y = 10;
        Robot robot1 = new Robot(10,"Prototip 1",8);

        System.out.println("Привет. Я робот id # " + robot1.id + " марки " + robot1.model + ". Я имею " + robot1.numberCores + " ядер(а)." );
        System.out.println("Я умею возводить число в некоторую степень. Например, " + x + " в степени " + y + " равно " + robot1.calc(x,y));


    }


}


