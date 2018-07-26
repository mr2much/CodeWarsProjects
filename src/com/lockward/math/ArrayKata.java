package com.lockward.math;

public class ArrayKata {
    public static char findMissingLetter(char[] chars) {
        int i;
        for (i = 1; i < chars.length; i++) {
            if (chars[i] - chars[i - 1] != 1) {
                break;
            }
        }

        return (char)(chars[i] - 1);
    }
}
