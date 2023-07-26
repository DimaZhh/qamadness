package org.example;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OurCollClassToTestJavaMemoryObjects {

    public static void main(String[] args) {

        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(11);
        collection.add(21);
        collection.add(2);
        collection.add(2);
        collection.add(2);
        collection.add(4);
        collection.add(9);

        collection.forEach(System.out::println);

        List<Integer> newCollection = new ArrayList<>();
        for (Integer elements : collection) {
            if (elements > 1) {
                if (elements > 2) {
                    newCollection.add(elements);
                }
            }
        }

        List<Integer> collect = collection.parallelStream()
                .filter(ourNumberFromArray -> ourNumberFromArray > 1)
                .filter(ourNumberFromArray -> ourNumberFromArray > 2)
                .distinct()
                .limit(1)
                .toList();

        Optional<Integer> first = collection.stream()
                .filter(ourElement -> ourElement % 2 == 0)
                .findFirst();

        first.ifPresent(System.out::println);
    }
}