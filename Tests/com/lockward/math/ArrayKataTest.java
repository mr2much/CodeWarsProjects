package com.lockward.math;

import org.junit.Test;

import static org.junit.Assert.*;

/*
#Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'
(Use the English alphabet with 26 letters!)
 */

public class ArrayKataTest {
    @Test
    public void testMissingLetter() {
        assertEquals('e', ArrayKata.findMissingLetter(new char[] {'a', 'b', 'c', 'd', 'f'}));
        assertEquals('P', ArrayKata.findMissingLetter(new char[] {'O', 'Q', 'R', 'S'}));
        assertEquals('y', ArrayKata.findMissingLetter(new char[] {'w', 'x', 'z'}));
        assertEquals('H', ArrayKata.findMissingLetter(new char[] {'G', 'I', 'J'}));
    }
}