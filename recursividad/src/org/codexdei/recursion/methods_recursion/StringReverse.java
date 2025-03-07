package org.codexdei.recursion.methods_recursion;

public class StringReverse {

    public static String reverseStringRecursive(String word){

        if (word.isEmpty()){

            return word;
        }

        return reverseStringRecursive( word.substring(1)) + word.charAt(0);
    }

    public static String reverseStringMax(String word){

        StringBuilder reverse = new StringBuilder(word);

        reverse.reverse();

        return reverse.toString();
    }
}
