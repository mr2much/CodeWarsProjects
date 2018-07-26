package com.lockward;

/*
Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return
true if the string is valid, and false if it's invalid.
 */

import java.util.*;

public class BraceChecker {
    private Map<Character, Character> validBraces;
    private Stack<Character> braces;

    public BraceChecker() {
        validBraces = new HashMap<>();
        validBraces.put('(', ')');
        validBraces.put('[', ']');
        validBraces.put('{', '}');
    }

    public boolean isValid(String input) {
        braces = new Stack<>();

        for (char c : input.toCharArray()) {
            if (braces.size() > 0 && !validBraces.containsKey(c)) {
                if (isClosing(braces.peek(), c)) {
                    braces.pop();
                }
            } else {
                braces.push(c);
            }
        }

        return braces.isEmpty();
    }

    private boolean isClosing(char openingBrace, char closingBrace) {
        System.out.println("Comparing: " + openingBrace + "\t" + closingBrace);
        return validBraces.get(openingBrace).equals(closingBrace);
    }
}
