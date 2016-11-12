package com.javaonlinecourse.b1lesson3.classwork;

import java.util.Arrays;

/**
 * @author emitrohin
 * @version 1.0
 *          12.11.2016
 */
public class SimpleArrays {
    public static void main(String[] args) {
        int[] i;
        int i1[];

        int[] x = new int[10];
        int[] x1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] x2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int j = 0; j < x.length; j++) {
            x[j] = j * j;
            System.out.println(x[j]);
        }

        System.out.println(Arrays.toString(x));

    }
}
