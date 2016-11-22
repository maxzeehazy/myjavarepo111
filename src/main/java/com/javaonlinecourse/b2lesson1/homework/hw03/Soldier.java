package com.javaonlinecourse.b2lesson1.homework.hw03;

/**
 * Created by EvilCorp on 18.11.2016.
 */
public class Soldier {
    String name;
    int age;
    String rank;
    int height;
    String bloodGroup;

    public Soldier(String name){
        this.name = name;
    }
        public Soldier(String name, int age){

            this.name = name;
            this.age = age;

        }

        public Soldier(String name, int age, String rank){

            this.name = name;
            this.age = age;
            this.rank = rank;

        }

        public Soldier(String name, int age, String rank, int height){

            this.name = name;
            this.age = age;
            this.rank = rank;
            this.height = height;

        }

        public Soldier(String name, int age, String rank, int height, String bloodGroup) {

            this.name = name;
            this.age = age;
            this.rank = rank;
            this.height = height;
            this.bloodGroup = bloodGroup;
        }

    }

