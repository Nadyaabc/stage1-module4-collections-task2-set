package com.epam.mjc.collections.set;

import java.math.BigInteger;
import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Iterator<Integer> it = sourceList.listIterator();
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        while(it.hasNext()){
          // navigableSet.add(Integer.getInteger(String.format("%.0f", Math.pow(it.next(), 2))));
            int number = it.next();
            navigableSet.add(number*number);
        }
        return navigableSet.subSet(lowerBound, upperBound+1);

    }
}
