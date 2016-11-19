package com.javaonlinecourse.b2lesson3.classwork.cw02;

/**
 * @author emitrohin
 * @version 1.0
 *          18.11.2016
 */
class Hard {

    public static void callM1(A obj)
    {
        obj.m1();
    }

    static class A{
        String x = "a";

        void m1()
        {
            System.out.println("A");
        }

    }

    static class B extends A{

        String x = "b";
        String c = "ccc123123c";

        void m1()
        {
            System.out.println("B");
        }

        void m2()
        {
            System.out.println("B");
        }
    }

    static class C extends B{
        String x = "c";
        String c = "cccc";

        void m1()
        {
            System.out.println("C");
        }

        void m2()
        {
            System.out.println("C");
        }

        void m3()
        {
            System.out.println("C");
        }
    }

    static class D {
        public static void main(String[] args) {
           // callM1(new C());

            C c = new C();
            System.out.println(((B)c).c);
        }
    }
}
