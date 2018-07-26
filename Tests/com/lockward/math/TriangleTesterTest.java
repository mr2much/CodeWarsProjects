package com.lockward.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TriangleTesterTest {
    @Test
    public void testTriangle() {
        assertTrue(TriangleTester.isTriangle(1, 2, 2));
        assertFalse(TriangleTester.isTriangle(7, 2, 2));
    }
}