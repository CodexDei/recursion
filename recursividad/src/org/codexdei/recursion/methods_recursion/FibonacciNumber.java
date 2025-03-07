package org.codexdei.recursion.methods_recursion;

import java.math.BigInteger;

public class FibonacciNumber {

    public static int fibonacci(int n){

        if ( n <= 1){

            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Fibonacci mas eficiente para numeros grandes
    public static BigInteger fibonacciBig(int n){

        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE, temp;

        for (int i = 2; i < n; i++){

            temp = a.add(b);
            a = b;
            b = temp;
        }

        return b;
    }


}
