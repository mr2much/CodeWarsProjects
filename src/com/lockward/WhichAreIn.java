package com.lockward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] a1, String[] a2) {
        List<String> r = new ArrayList<>();

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a2[j].contains(a1[i])) {
                    if (!r.contains(a1[i])) {
                        r.add(a1[i]);
                    }
                }
            }
        }

        return r.toArray(new String[r.size()]);
    }
}
