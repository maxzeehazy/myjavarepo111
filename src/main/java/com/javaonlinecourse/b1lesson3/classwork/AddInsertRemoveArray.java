package com.javaonlinecourse.b1lesson3.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          12.11.2016
 */

// добавить в массив, удалить элемент, вставить элемент
public class AddInsertRemoveArray {

    public static void main(String[] args) {
        int[] dayCash = {
                100,
                5000,
                600,
                700,
                98110,
                5000
        };

        System.out.println("Массив инициализирован");
        for (int i = 0; i < dayCash.length; i++) {
            System.out.println(dayCash[i]);
        }

        //Добавление
        int addCash = 900;

        int[] addDayCash = new int[dayCash.length + 1];
        for (int i = 0; i < dayCash.length; i++) {
            addDayCash[i] = dayCash[i];
        }

        addDayCash[addDayCash.length - 1] = addCash;
        System.out.println("Массив после добавления");
        for (int i = 0; i < addDayCash.length; i++) {
            System.out.println(addDayCash[i]);
        }

        //Удаление
        int removeIndex = 4;
        for (int i = removeIndex; i < addDayCash.length - 1; i++) {
            addDayCash[i] = addDayCash[i + 1];
        }

        int[] removeDayCash = new int[addDayCash.length - 1];
        for (int i = 0; i < removeDayCash.length; i++) {
            removeDayCash[i] = addDayCash[i];
        }

        System.out.println("Массив после удаления");
        for (int i = 0; i < removeDayCash.length; i++) {
            System.out.println(removeDayCash[i]);
        }

        //Вставка
        int insertCash = 98110;
        int insertIndex = 4;
        int[] insertDayCash = new int[addDayCash.length];

        for (int i = 0; i < insertIndex; i++) {
            insertDayCash[i] = removeDayCash[i];
        }

        insertDayCash[insertIndex] = insertCash;

        for (int i = insertIndex + 1; i < insertDayCash.length; i++) {
            insertDayCash[i] = removeDayCash[i - 1];
        }

        System.out.println("Массив после вставки");
        for (int i = 0; i < insertDayCash.length; i++) {
            System.out.println(insertDayCash[i]);
        }

    }
}

