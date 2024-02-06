package org.example;

import java.util.ArrayList;
import java.util.List;
//import java.util.Observable;
//import java.util.Observer;

public class SubjectAgentBolsa {
    private List<Observable> observers = new ArrayList<Observable>();
    private int stateBolsa;

    public int getStateBolsa() {
//        for (int i = 0; i < 10 ; i++) {
//           int index = i + 1;
//           return index;
//        }
        return stateBolsa;
    }

    public void notifyObservers() {
        this.observers.forEach(Observable::update);
    }
    public void attachObservers(Observable observable) {
        observers.add(observable);
    }
    public void setStateBolsa(int stateBolsa) {
        this.stateBolsa = stateBolsa;
        notifyObservers();

    }
}
