package com.javaonlinecourse.b2lesson1.homework.hw02;

/**
 * Вывести на экран следующий текст - две строки:
 * Путь к Java в Windows: "C:\Program Files\Java\jdk1.8.0\bin"
 * Java cтрока: "C:\\Program Files\\Java\\jdk1.8.0\\bin\"
 *
 * Материал в помощь:
 * http://ru.stackoverflow.com/questions/413254/Как-вставить-символ-двойных-кавычек-в-строку
 *
 */
public class HW04 {
    public static void main(String[] args)
    {
        String x = "\\";
        String y = "\"";
        System.out.println("Путь к Java в Windows: " + y + "C:" + x + "Program Files" + x + "Java" + x + "jdk1.8.0" + x + "bin" + y);
        System.out.println("Java cтрока: " + y + "C:" + x + "Program Files" + x + "Java" + x + "jdk1.8.0" + x + "bin" + y);

    }
}

