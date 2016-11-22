package com.javaonlinecourse.b2lesson2.homework.hw02;

/**
 * Раскомментируй код
 * Переставь один модификатор static, чтобы пример скомпилировался.
 */
public class HomeTask04 {
   public static int Lenin = 5;
    public static int USSR = 2;

    public int Gorbachev = Lenin * USSR;
    public static int Perestroyka = USSR * Lenin;

    public static void main(String[] args)
    {
    }

    public int getPerestroyka()
    {
        return Perestroyka;
    }

    public int getGorbachev()
    {
        return Gorbachev;
    }
}
