package com.lockward;

import java.util.*;

public class WhichAreIn {
    public static String[] inArray(String[] a1, String[] a2) {
        Set<String> result = new TreeSet<>();
        List<String> r = new ArrayList<>();

        for (String strToLook : a1) {
            for (String strToCompare : a2) {
                if (strToCompare.contains(strToLook)) {
                    result.add(strToLook);
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }
}
