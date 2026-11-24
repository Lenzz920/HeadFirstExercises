package Streams;

import java.util.*;

public class Streams1 {


    public static void main(String[] args) {
        List<String> names = List.of("Study", "Work", "Meeting", "Sports");

        //print each name, it takes a Consumer
        names.forEach(System.out::println);

        System.out.println("-----------");

        //keep only the names that have more than 4 letters, it takes a Predicate
        names.stream()
                .filter(s -> s.length() > 4)
                .forEach(System.out::println);

        System.out.println("-----------");

        //print each item inside the list in uppercase
        names.stream()
                .map(a -> a.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);

        System.out.println("---------------");

        //print the number of words that start with S
        System.out.println(names.stream()
                .filter(s -> s.startsWith("S"))
                .count());

        System.out.println("----------------");

        //print the list in natural, and then reversed order
        names.stream()
                .sorted()
                .forEach(System.out::println);

        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("------------");

        //combine 2, 3 and 5 into 1 pipeline
        names.stream()
                .filter(s -> s.length() > 4)
                .map(s -> s.toUpperCase(Locale.ROOT))
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------------");

        //keep(retain) values, that are part of every Set inside of the List
        List<Set<String>> cards = List.of(
                Set.of("A", "B", "C", "D"),
                Set.of("B", "C", "D"),
                Set.of("C", "D", "E"));

        Set<String> cardsCollection = cards.stream()
                .reduce((currentSet, second) -> {
                    Set<String> common = new HashSet<>(currentSet);
                    common.retainAll(second);
                    return common;
                })
                .orElse(new HashSet<>());

        System.out.println(cardsCollection);

    }

}
