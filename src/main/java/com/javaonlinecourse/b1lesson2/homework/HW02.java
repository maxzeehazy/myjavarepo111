package com.javaonlinecourse.b1lesson2.homework;

/**
 * Парень и девушка пытаются забронировать столик в модном ресторане.
 * Параметр "boyStyleLevel" стильность твоей одежды в диапазоне 0..10, а "girlStyleLevel" стильность девушки.
 * Результат  кодируется значениями 0=да, 1=вероятно, 2=нет.
 * Если вы оба очень стильные, 8 и более, то - 0 (да).
 * Если ваш стиль оценивается 2 и менее, то - 2 (нет).
 * В других случаях - 1 (вероятно).
 */
public class HW02 {
    public static void main(String[] args) {

        int boyStyleLevel, girlStyleLevel;
        boyStyleLevel = 10;
        girlStyleLevel = 10;

        if (boyStyleLevel >= 8 & girlStyleLevel >= 8){
            System.out.println(0 + " (да)");
        } else if (boyStyleLevel <= 2 & girlStyleLevel <= 2){
            System.out.println(2 + " (нет)");
        } else {
            System.out.println(1 + " (вероятно)");
        }

    }
}