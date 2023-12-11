package org.example;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods<>("objeto", 1, "hola");
        NoGenericMethods obj2 = new NoGenericMethods<>("hola", 2, "objeto");
        NoGenericMethods obj3 = new NoGenericMethods<>(3, 2, "objeto");
    }
}