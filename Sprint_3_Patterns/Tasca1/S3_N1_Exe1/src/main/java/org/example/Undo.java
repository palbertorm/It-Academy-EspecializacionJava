package org.example;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private  static final Undo instance = new Undo();
    List<String> dataList = new ArrayList<String>();
    //create an object of SingleObject

    //make the constructor private so that this class cannot be
    //instantiated
    private Undo(){}

    //Get the only object available

    public static Undo getInstance() {
        return instance;
    }
    public void addData(String data){
        dataList.add(data);
        System.out.println("addData");
    }
    public void removeData(String data){
        dataList.remove(data);
        System.out.println("removeData");
    }
    public void listData(String data){
        dataList.forEach(System.out::println);
       // System.out.println("listData" + " "+ data);
    }
}
