package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String data;
        Scanner input = new Scanner(System.in);
        System.out.println("Type some data...");
        data = input.next();

        Undo managerData = Undo.getInstance();
        managerData.addData(data);
        managerData.listData(data);
        managerData.removeData(data);
        input.close();

    }
}