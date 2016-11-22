package com.javaonlinecourse.b2lesson3.homework.hw02;

/**
 * @author emitrohin
 * @version 1.0
 *          18.11.2016
 *
 * Программисты
 * Раскомментировать код
 * Создать класс JavaProgrammer, который наследуется от Programmer.
 * Реализовать все абстрактные методы.
 * Подумай, что должен возвращать метод getLanguage.
 * Программа должна выводить на экран "Я программирую с %язык%".
 * Метод main менять нельзя.
 *
 */
public class Task01 {

  public static void main(String[] args) throws Exception
    {
        JavaProgrammer javaProgrammer = new JavaProgrammer();
        PascalProgrammer pascalProgrammer = new PascalProgrammer();
        CSharpProgrammer cSharpProgrammer = new CSharpProgrammer();
        System.out.println(javaProgrammer.code());
        System.out.println(pascalProgrammer.code());
        System.out.println(cSharpProgrammer.code());

    }

    public static abstract class Programmer
    {
        public abstract String getLanguage();

        public String code()
        {
            return "Я программирую на " + getLanguage();
        }
    }

}
