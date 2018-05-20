package com.upday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ajay on 5/20/2018.
 */
public class FlattenArray {
    public static Integer[] flatten(Object[] input) throws IllegalArgumentException {

        if (input == null) return null;

        List<Integer> flattenedList = new ArrayList<Integer>();

        for (Object o : input) {
            if (o instanceof Integer) {
                flattenedList.add((Integer) o);
            } else if (o instanceof Object[]) {
                flattenedList.addAll(Arrays.asList(flatten((Object[]) o)));
            } else {
                throw new IllegalArgumentException("Not a valid nested array");
            }
        }
        return flattenedList.toArray(new Integer[flattenedList.size()]);
    }
}
