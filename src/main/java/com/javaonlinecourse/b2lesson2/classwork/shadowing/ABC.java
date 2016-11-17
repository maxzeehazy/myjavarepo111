package com.javaonlinecourse.b2lesson2.classwork.shadowing;

/**
 * Created by E_Mitrohin on 17.11.2016.
 */
public class ABC {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.printA();
        a.printX();
        System.out.println();
        b.printB();
        b.printX();
        System.out.println();
        c.printC();
        c.printX();
        System.out.println();
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(c.x);
        System.out.println();
        System.out.println(((A)b).x);
        System.out.println(((A)c).x);
        System.out.println(((B)c).x);
    }
}
