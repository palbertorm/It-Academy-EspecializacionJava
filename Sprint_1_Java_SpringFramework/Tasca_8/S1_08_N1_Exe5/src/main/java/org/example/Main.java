package org.example;

public class Main {
    public static void main(String[] args) {

        MiInterfaceFuncional pi = () -> 3.1415;{
            System.out.println(pi.getPiValue());
        };
    }
}