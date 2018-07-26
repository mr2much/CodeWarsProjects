package com.lockward;

import org.junit.Test;

/*
This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}.
Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace.

Examples
"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False
 */

import static org.junit.Assert.*;

public class BraceCheckerTest {
    private BraceChecker checker = new BraceChecker();

    @Test
    public void bracesShouldBeValid() {
        assertTrue(checker.isValid("()"));
        assertTrue(checker.isValid("[]"));
        assertTrue(checker.isValid("{}"));
        assertTrue(checker.isValid("(){}[]"));
        assertTrue(checker.isValid("([{}])"));
    }

    @Test
    public void bracesShouldBeInvalid() {
        assertFalse(checker.isValid("(}"));
        assertFalse(checker.isValid("[(])"));
        assertFalse(checker.isValid("[({})](]"));
    }
}