package com.lockward;

/*
Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return
true if the string is valid, and false if it's invalid.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BraceChecker {
    private Map<Character, Character> validBraces;
    private Stack<Character> braces;

    public BraceChecker() {
        validBraces = new HashMap<>();
        validBraces.put(')', '(');
        validBraces.put(']', '[');
        validBraces.put('}', '{');
    }

    public boolean isValid(String input) {
        braces = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            braces.push(input.charAt(i));
        }

        while (!braces.isEmpty()) {
            char brace = braces.pop();

            if (validBraces.containsKey(brace)) {
                char doNothing = braces.pop();
                System.out.println("Found: " + brace + "\t" + doNothing);
            }
        }


        return braces.isEmpty();
    }
}
