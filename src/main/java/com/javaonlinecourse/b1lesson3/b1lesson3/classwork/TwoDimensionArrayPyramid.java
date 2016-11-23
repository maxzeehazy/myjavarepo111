package com.javaonlinecourse.b1lesson3.b1lesson3.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          12.11.2016
 */
public class TwoDimensionArrayPyramid {
    public static void main(String[] args) {
        int[][] twoD = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int k = 0;

        for (int i = 0; i < twoD.length; i++)
            for (int j = 0; j < twoD[i].length; j++){
                twoD[i][j] = k;
                k++;
            }

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}