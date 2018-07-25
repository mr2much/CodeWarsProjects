package com.lockward;

import org.junit.Test;

import static org.junit.Assert.*;

/*
    Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which
    are substrings of strings of a2.
 */

public class WhichAreInTest {
/*
    #Example 1: a1 = ["arp", "live", "strong"]

    a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

    returns ["arp", "live", "strong"]
 */
    @Test
    public void testShouldReturnOrderedArray() {
        String[] a1 = {"arp", "live", "strong"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] r = {"arp", "live", "strong"};

        assertArrayEquals(r, WhichAreIn.inArray(a1, a2));
    }

/*
    #Example 2: a1 = ["tarp", "mice", "bull"]

    a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

    returns []
 */

    @Test
    public void testShouldReturnEmptyArray() {
        String[] a1 = {"tarp", "mice", "bull"};

        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        String[] r = {};

        assertArrayEquals(r, WhichAreIn.inArray(a1, a2));
    }
}