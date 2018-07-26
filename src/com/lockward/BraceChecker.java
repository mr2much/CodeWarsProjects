package com.lockward;

/*
Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return
true if the string is valid, and false if it's invalid.
 */

import java.util.*;

public class BraceChecker {
    private Map<Character, Character> validBraces;
    private LinkedList<Character> braces;

    public BraceChecker() {
        validBraces = new HashMap<>();
        validBraces.put('(', ')');
        validBraces.put('[', ']');
        validBraces.put('{', '}');
    }

    public boolean isValid(String input) {
        braces = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            braces.add(input.charAt(i));
        }

        while (!braces.isEmpty()) {
            char openingBrace = braces.pop();
            char closingBrace;

            if (validBraces.containsKey(openingBrace)) {
                closingBrace = validBraces.get(openingBrace);

                if(closingBrace == braces.peek()) {
                    braces.pop();
                } else if (closingBrace == braces.peekFirst()) {
                    braces.pollFirst();
                } else if (closingBrace == braces.peekLast()) {
                    braces.pollLast();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return braces.isEmpty();
    }
}
