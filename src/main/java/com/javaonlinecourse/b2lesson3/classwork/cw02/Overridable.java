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
public class Overridable {

    class Tank {

       /* public void printAll() {
            System.out.println("А может быть .. ");
            printAction();
            printName();

        }*/

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
        Aircraft boeing = new Overridable().new Aircraft();
        boeing.printName();
        //boeing.printAll();
    }

}
