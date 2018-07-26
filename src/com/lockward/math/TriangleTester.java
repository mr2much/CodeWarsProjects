package com.lockward.math;

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        boolean ab = a + b > c;
        boolean ac = a + c > b;
        boolean cb = c + b > a;

        return ab && ac && cb;
    }
}
