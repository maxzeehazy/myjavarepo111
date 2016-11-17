package com.javaonlinecourse.b2lesson2.classwork;

public class Packages {
}

// класс доступен в рамках пакета
class MainClass {

    // скрытый внутренний класс. Виден только внутри класса MainClass.
    private class MyInnerClass {
    }

    // скрытый интерфейс. Доступен внутри класса MainClass.
    private interface MyInnerInterface {
    }

    // Доступен везде, но создан может быть только изнутри MainClass
    public class MyPublicInnerClass {}

    // Доступен везде. Может быть создан в статическом контексте.
    // В отличие от обычных inner-классов, не имеет доступа к членам MainClass.
    public static class MyStaticClass {}
}

// интерфейс доступен в рамках пакета
interface TestInterface {
}