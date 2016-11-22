package com.javaonlinecourse.b2lesson3.homework.hw01;

/**
 * @author emitrohin
 * @version 1.0
 *
 * Whiskey & soda
 *
 * Реализуй интерфейс Drinkable в классах Whiskey и Soda.
 * Реализуй метод printIt
 *
 */
public class Task03 {

    private static void printIt(Drinkable drink)
    {

    }

    public interface Drinkable
    {
        boolean isAlcoholic();
    }

    public static class Whiskey implements Drinkable {

        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }

    public static class Soda implements Drinkable
    {

        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }
}
