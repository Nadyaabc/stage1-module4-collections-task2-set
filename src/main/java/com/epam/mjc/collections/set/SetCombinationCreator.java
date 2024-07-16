package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*Implement the program which creates Set<String> of 3 Sets.
Result Set should consist of the following elements:

elements that belong to the first and the second Sets at once and not belong to the third Set
elements that belong only to the third Set.*/
public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();
        Iterator<String> it = firstSet.iterator();
        String value;
        while (it.hasNext())
        {
            value = it.next();
            if (secondSet.contains(value) && !thirdSet.contains(value)) resultSet.add(value);
        }
        it = thirdSet.iterator();
        while(it.hasNext()){
            value = it.next();
            if (!secondSet.contains(value) && !firstSet.contains(value)) resultSet.add(value);
        }
        return resultSet;
    }
}
