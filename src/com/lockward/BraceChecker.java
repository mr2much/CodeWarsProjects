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
        braces = new Stack<>();
        validBraces = new HashMap<>();
        validBraces.put('(', ')');
        validBraces.put('[', ']');
        validBraces.put('{', '}');
    }

    public boolean isValid(String input) {
        for (char c : input.toCharArray()) {
            if (braces.size() > 0 && currentCharacterIsAClosingBrace(c)) {
                if (checkIfCharacterIsMatchingClosingBrace(c)) {
                    removeOpeningBraceFromTheStack();
                }
            } else {
                addOpeningBraceToTheStack(c);
            }
        }

        return braces.isEmpty();
    }

    private boolean currentCharacterIsAClosingBrace(char c) {
        return !validBraces.containsKey(c);
    }

    private boolean checkIfCharacterIsMatchingClosingBrace(char closingBrace) {
        char openingBrace = braces.peek();
        return validBraces.get(openingBrace).equals(closingBrace);
    }

    private void removeOpeningBraceFromTheStack() {
        braces.pop();
    }

    private void addOpeningBraceToTheStack(char openingBrace) {
        braces.push(openingBrace);
    }
}
