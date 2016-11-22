package com.javaonlinecourse.b2lesson1.homework.hw01;

/**
 * Создайте классы Cat(кот), Dog(собака), Hamster(хомяк), Human(человек) в пакете hw01
 * В каждом классе объявите поле name(имя), age(возраст). Подумайте какими типами они могут являться
 * В каждом классах Cat, Dog, Hamster объявите поле с именем owner. Подумайте каким типом оно может являться
 * Создайте класс Main в пакете hw01, в котором создайте объекты Cat, Dog, Hamster, Human.
 * Присвойте каждому животному владельца (owner).
 */

 class Cat {
    int age;
    String name;
    String ovner;
}

class Dog {
    int age;
    String name;
    String ovner;
}
class Hamster {
    int age;
    String name;
    String ovner;
}

class Human {
    int age;
    int age3;
    int age2;
    String name;
    String name2;
    String name3;
}
public class HW01 {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Сергей";
        human.age = 25;
        human.name2 = "Максим";
        human.age2 = 21;
        human.name3 = "Олег";
        human.age3 = 15;


        Cat cat = new Cat();
        Dog dog = new Dog();
        Hamster hamster = new Hamster();

        cat.age = 4;
        cat.name = "Барсик";
        cat.ovner = human.name;


        dog.age = 10;
        dog.name = "Барон";
        dog.ovner = human.name2;

        hamster.age = 1;
        hamster.name = "Жорик";
        hamster.ovner = human.name3;
        System.out.println("Имя кота  " + cat.name + " возрост: " + cat.age + " хозяин " +cat.ovner );
        System.out.println("Имя собаки " + dog.name + " возрост: " + dog.age + " хозяин " +dog.ovner );
        System.out.println("Имя хомяка " + hamster.name + " возрост: " + hamster.age + " хозяин " +hamster.ovner );

    }
}


