package com.javaonlinecourse.b2lesson2.homework.hw02;

/**
 * Создай класс Human с полями
 * имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 * Создай объекты и заполни их так, чтобы получилось:
 * 2 деда, 2 бабки, 1 папа, 1 мама, четверо детей у мамы и папы.
 * Вывести людей на экран.
 *
 * римечание:
 * Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
 *
 * Пример вывода:
 * Имя: Ася, пол: женский, возраст: 35, папа: Григорий, мама: Елизавета
 * Имя: Олег, пол: мужской, возраст: 76
 * Имя: Николай, пол: мужской, возраст: 5, отец: Анатолий, мать: Ольга
 */
public class HomeTask05 {


    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        String father;
        String mother;


        public Human(String name, Boolean sex, int age ){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name, Boolean sex, int age, Human father, Human mother ){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father.name;
            this.mother = mother.name;
        }



        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father;

            if (this.mother != null)
                text += ", мать: " + this.mother;

            return text;
        }

    }
    public static void main(String[] args)
    {

        Human ded1 = new Human("Petya", true, 55);
        Human ded2 = new Human("Kolya", true, 60);
        Human bab1 = new Human("Masha", false, 55);
        Human bab2 = new Human("Rita", false, 55);
        Human fat1 = new Human("Sasha", true, 30, ded1, bab1);
        Human mam1 = new Human("Olya", false, 35, ded2, bab2);
        Human kid1 = new Human("Anna", false, 10, fat1, mam1);
        Human kid2 = new Human("Nadja", false, 12, fat1, mam1);
        Human kid3 = new Human("Vasja", false, 13, fat1, mam1);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(fat1);
        System.out.println(mam1);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

    }

}

