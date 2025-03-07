package org.codexdei.recursion.exercises;

import org.codexdei.recursion.methods_recursion.FactorialNumber;
import org.codexdei.recursion.methods_recursion.FibonacciNumber;
import org.codexdei.recursion.methods_recursion.SumDigit;

public class OperationMathematics {

    public static void main(String[] args) {

        int number = 12;

        System.out.println("Fibonacci of '" + number + "' is:" + FibonacciNumber.fibonacci(number));

        System.out.println("Factorial of '" + number + "' is:" + FactorialNumber.factorial(number));

        System.out.println("Sum of the digits of '" + number + "' is:" + SumDigit.sumDigits(number));

        //para numeros grandes
//        int bigNumber = 1234567;
//
//        System.out.println("Fibonacci of '" + bigNumber + "' is:" + FibonacciNumber.fibonacciBig(bigNumber));
//
//        System.out.println("Factorial of '" + bigNumber + "' is:" + FactorialNumber.factorialBig(bigNumber));
//
//        System.out.println("Sum of the digits of '" + bigNumber + "' is:" + SumDigit.sumDigitsBig(bigNumber));

        int[] numbers = {5,25,32,4,11,8,52,100,0};

        System.out.println("number mayor is: " + ArrayNumberMax.maxNumber(numbers, numbers.length));

    }
}
