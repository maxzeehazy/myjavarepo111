package com.javaonlinecourse.b2lesson2.homework.hw02;

/**
 * Напиши класс Student с 6 полями.
 * Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
 */
public class HomeTask02 {
    public static void main(String[] args) {

    }
    public  class Student
    {
         String name;
         String surname;
         int age;
         String address;
         int phone;
         String car;

        public Student(String name) {
            this.name = name;
        }

        public Student(String surname, int age) {
            this.surname = surname;
            this.age = age;
        }


        public Student(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Student(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Student(String name, String surname, int age, String address) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
        }

        public Student(String name, String surname, int age, String address, int phone) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
            this.phone = phone;
        }

        public Student(String name, String surname, int age, String address, int phone, String car) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.car = car;
        }
    }
}
