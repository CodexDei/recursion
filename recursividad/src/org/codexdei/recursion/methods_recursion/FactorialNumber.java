package org.codexdei.recursion.methods_recursion;

import java.math.BigInteger;

public class FactorialNumber {

    public static int factorial(int n){

        if (n == 0){

            return 1;
        }

        return n * factorial(n - 1);
    }

    public static BigInteger factorialBig(int n){

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i < n; i++){

            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
