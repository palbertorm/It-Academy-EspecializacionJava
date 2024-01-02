package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("julio","maio","barcelona",2,9,1,"enero");
        list.stream().sorted(Comparator.comparing(Object::toString).reversed())
                .forEach(System.out::println);


    }
}