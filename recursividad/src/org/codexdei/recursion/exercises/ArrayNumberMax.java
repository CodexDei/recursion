package org.codexdei.recursion.exercises;

public class ArrayNumberMax {

    public static int maxNumber(int[] array, int n){

        if(n == 1){

            return array[0];
        }

        return Math.max(array[n - 1], maxNumber(array, n - 1));
    }
}
