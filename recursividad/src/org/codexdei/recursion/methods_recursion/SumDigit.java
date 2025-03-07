package org.codexdei.recursion.methods_recursion;

import java.math.BigInteger;

public class SumDigit {

    public static int sumDigits(int n){

        if(n == 0){

            return 0;

        }else {

           return  (n % 10) + sumDigits(n / 10);
        }
    }

    public static BigInteger sumDigitsBig(int n){

        BigInteger sum = BigInteger.ZERO;

        while (n > 0){

            sum = sum.add(BigInteger.valueOf(n % 10));
            n /= 10;
        }
        return sum;
    }
}
