package com.javaonlinecourse.b1lesson1.classwork;

/**
 * Пример использования литералов
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // 16-ричное представление (нижний регистр)
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // 16-ричное представление (верхинй регистр)
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // 8-ричное (ноль впереди) обратите внимание на подсказки idea
        System.out.println("i2: " + Integer.toBinaryString(i3));
        // (16-ричное представление и 8-ричное представление работает и с long)
        byte b = 0x7f; // максимальный байт в 16-ричном виде
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // максимальный short в 16-ричном виде
        System.out.println("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // литерал для long
        long n2 = 200l; // литерал для long (можно спутать с единицей) обратите внимание на подсказки idea
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // литерал для float
        float f3 = 1f; // литерал для float
        double d1 = 1d; // литерал для double
        double d2 = 1D; // литерал для double
    }
}
