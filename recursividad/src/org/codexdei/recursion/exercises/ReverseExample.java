package org.codexdei.recursion.exercises;

import org.codexdei.recursion.methods_recursion.StringReverse;

import java.util.Scanner;

public class ReverseExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Into the word to like reverse:");
        String word = sc.next();

        System.out.println("The word \'" + word + "\' to reverse is:" + StringReverse.reverseStringMax(word));
        System.out.println("The word \'" + word + "\' to reverse is:" + StringReverse.reverseStringRecursive(word));
    }
}
