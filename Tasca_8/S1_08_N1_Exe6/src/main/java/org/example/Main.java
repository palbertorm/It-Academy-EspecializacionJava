package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("julio","maio","barcelona",2,9,1,"enero");
        list.stream().filter(o -> o instanceof String).map(Object::toString).sorted(Comparator.comparing(String::length)).forEach(System.out::println);


    }
}