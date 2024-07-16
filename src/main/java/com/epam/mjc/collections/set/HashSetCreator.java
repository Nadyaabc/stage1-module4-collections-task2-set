package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        Iterator<Integer> it = sourceList.listIterator();
        HashSet<Integer> hashSet = new HashSet<>();
        while (it.hasNext()) {
            int number = it.next();
            hashSet.add(number);
            if (number % 2 == 0) {
                while (number % 2 == 0) {
                    number /= 2;
                    hashSet.add(number);
                }
            } else hashSet.add(number * 2);
        }
        return hashSet;


    }
}
