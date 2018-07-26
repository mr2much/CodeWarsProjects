package com.lockward.math;

public class ArrayKata {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static char findMissingLetter(char[] chars) {
        String newAlphabet = alphabet;
        if (Character.isUpperCase(chars[0]))
            newAlphabet = alphabet.toUpperCase();

        int index = newAlphabet.indexOf(chars[0]);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != newAlphabet.charAt(index)) {
                return newAlphabet.charAt(index);
            }

            index++;
        }

        return '\0';
    }
}
