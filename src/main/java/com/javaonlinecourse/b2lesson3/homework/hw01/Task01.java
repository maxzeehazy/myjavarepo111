package com.javaonlinecourse.b2lesson3.homework.hw01;

/**
 * @author emitrohin
 * @version 1.0
 *
 * 1. Подумай, какой из двух интерфейсов нужно реализовать в классе Vodka.
 * 2. Добавь к классу Vodka этот интерфейс и реализуйте все нереализованные методы.
 * 3. Подумай, как связаны переменная  READY_FOR_ADVENTURES и метод isReadyToForAdventures.
 * 4. Верни значение переменной READY_FOR_ADVENTURES в методе isReadyToForAdventures.
 *
 */

public class Task01 {
    public static void main(String[] args) throws Exception
    {
    }

    public interface Drinkable
    {
        void orderMore(String message);

        void saySomethingNice();

        boolean isReadyToForAdventures();


    }

    public interface Alcoholic extends Drinkable
    {
        boolean READY_FOR_ADVENTURES = false;

        void startToDance();
    }


    public static class Vodka implements Drinkable

        {

            public void orderMore(String message){
            }
            public void saySomethingNice(){
            }
            public  boolean isReadyToForAdventures(){
                return Alcoholic.READY_FOR_ADVENTURES;
            }
            public void startToDance(){

            }

        }
    }

