package com.javaonlinecourse.b2lesson2.homework.hw03;

/**
 * Измени строку 'Object object = new Pet();' в методе main так, чтобы было выведено "Да, ты капитан очевидность!"
 */
public class HomeTask03 {
    public static void main(String[] args)
    {
        Object object = new Item();
        boolean isPhone = object instanceof Phone;
        boolean isCellPhone = object instanceof CellPhone;
        boolean isIPhone = object instanceof IPhone;
        boolean isItem = object instanceof Item;

        printResults(isPhone, isCellPhone, isIPhone, isItem);
    }

    private static void printResults(boolean phone, boolean cellPhone, boolean iPhone, boolean item)
    {
        if (phone && cellPhone && iPhone && item) System.out.println("Да, ты капитан очевидность!");
        else System.out.println("Ну ты блин даешь!");
    }

    static class Item
    {
    }

    static class Phone extends Item
    {
    }

    static class CellPhone extends Phone
    {
    }

    static class IPhone extends CellPhone
    {
    }
}
