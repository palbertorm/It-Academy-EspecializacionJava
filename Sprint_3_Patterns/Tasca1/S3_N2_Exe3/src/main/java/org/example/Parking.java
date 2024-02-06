package org.example;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Order> parkingList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        parkingList.add(order);
    }
    public void  putOrder(){
//        for (Order place: parkingList
//             ) {
//            place.execute();
//        }
        this.parkingList.forEach(Order::execute);
    }
}
