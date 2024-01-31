package org.example;

public class Main {
    public static void main(String[] args) {
        Contact argentina = new Country();
        Location paisArgentina = argentina.createLocation("argentina");
        Code code = argentina.createCode("argentina");
        System.out.println(paisArgentina.nameLocation() + " " + code.codeZone());
    }
}