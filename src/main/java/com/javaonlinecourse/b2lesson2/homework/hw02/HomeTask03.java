package com.javaonlinecourse.b2lesson2.homework.hw02;

/**
 * Раскомментируй код
 * Расставь модификаторы static так, чтобы пример скомпилировался.
 */
public class HomeTask03 {

    public static int Lenin = 5;
    public static int B = 2 * Lenin;
    public int Gorbachev = Lenin * B;
    public static int Perestroyka = Lenin * B;

    public void main(String[] args)
    {
        HomeTask03 superPuper = new HomeTask03();
        superPuper.Lenin = 5;

        HomeTask03.Perestroyka = 5;
    }

    public int getA()
    {
        return Lenin;
    }

}
