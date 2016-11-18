package com.javaonlinecourse.b2lesson3.classwork.cw02;

/**
 * @author emitrohin
 * @version 1.0
 *          18.11.2016
 *
 *  Главное, не в каком классе написан метод,
 *  а какой тип (класс) объекта, у которого этот метод вызван.
 *  
 */
public class Overridable2 {

    class Tank {

        public void printAction() {
            System.out.println("Я еду!");
        }

        public void printName() {
            System.out.println("Я - танк");
        }

    }

    class Aircraft extends Tank {
        public void printName() {
            System.out.println("А вот ничего подобного! Я - самолет");
        }
    }

    public static void main(String[] args) {
        /*
            В переменной типа Tank сохранена ссылка на объект типа Aircraft,
            и будет вызван метод printName(), описанный в классе Aircraft.
         */
        Tank tank = new Overridable2().new Aircraft();
        tank.printName();
    }

}
