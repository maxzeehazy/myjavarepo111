package com.javaonlinecourse.b2lesson3.homework.hw01;

/**
 * @author emitrohin
 * @version 1.0
 *
 * Cocktail: The revenge of Vodka
 * Добавь к классу Vodka интерфейс и реализуй все нереализованные методы.
 */
public class Task02 {
    public static void main(String[] args) throws Exception
    {
    Cocktail isAlcoholic = new Cocktail();
        System.out.println(isAlcoholic);
    }

    public interface Drinkable
    {
        boolean isAlcoholic();
    }

    public static class Cocktail implements Drinkable
    {


        @Override
        public String toString()
        {
            return "Домой";
        }
        @Override
        public boolean isAlcoholic(){

            return false;
        }
    }
}