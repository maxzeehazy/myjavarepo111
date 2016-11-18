package com.javaonlinecourse.b2lesson3.classwork.cw02;

/**
 * @author emitrohin
 * @version 1.0
 *          18.11.2016
 */
class Hard {
    class A{
        void m1(A a)
        {
            System.out.println("A");
        }
    }

    class B extends A{
        void m1(B b)
        {
            System.out.println("B");
        }
    }

    class C extends B{
        void m1(C C)
        {
            System.out.println("C");
        }
    }

    static class D {
        public static void main(String[] args) {
            A c1 = new Hard().new C();
            c1.m1(new Hard().new B());
        }
    }
}
