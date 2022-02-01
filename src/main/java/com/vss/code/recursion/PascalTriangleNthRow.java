package com.vss.code.recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleNthRow {
    public static List<Integer> getNthRow(final int index) {
        final List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
        if (index != 0) {
            final List<Integer> prevRow = getNthRow(index - 1);
            for (int i = 1; i < prevRow.size(); i++) {
                final int current = prevRow.get(i - 1) + prevRow.get(i);
                currentRow.add(current);
            }
            currentRow.add(1);
        }
        return currentRow;
    }
}
