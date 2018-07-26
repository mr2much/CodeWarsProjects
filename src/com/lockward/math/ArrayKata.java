package com.lockward.math;

public class ArrayKata {
    public static char findMissingLetter(char[] chars, int index) {
        if ((chars[index + 1] - chars[index] != 1) || index == chars.length ) {
            return (char) (chars[index] + 1);
        }

        return findMissingLetter(chars, index + 1);
    }
}
