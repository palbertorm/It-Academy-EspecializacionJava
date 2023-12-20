package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mesos = new ArrayList<String>();
        mesos.add("enero");
        mesos.add("febrero");
        mesos.add("marzo");
        mesos.add("abril");
        mesos.add("mayo");
        mesos.add("junio");
        mesos.add("julio");
        mesos.add("agosto");
        mesos.add("septembre");
        mesos.add("noviembre");
        mesos.add("diciembre");
        mesos.forEach(System.out::println
        );
    }
}