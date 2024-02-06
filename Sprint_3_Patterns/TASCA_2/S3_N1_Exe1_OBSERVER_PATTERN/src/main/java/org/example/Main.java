package org.example;

public class Main {
    public static void main(String[] args) {
        SubjectAgentBolsa subject = new SubjectAgentBolsa();
        Observable observable = new AgencyObserver2(subject);


        new AgencyObserver1(subject);
        subject.setStateBolsa(45);
//        System.out.println(" first state update sum 5 +45 " + subject.getStateBolsa());
        subject.attachObservers(observable);
    }
}