package org.example;

public class AgencyObserver2 extends Observable {
    public AgencyObserver2(SubjectAgentBolsa subjectAgentBolsa) {
        this.subjectAgentBolsa= subjectAgentBolsa;
        this.subjectAgentBolsa.attachObservers(this);
    }
    @Override
    public void update(){
        System.out.println("update " + Integer.sum(28, subjectAgentBolsa.getStateBolsa()));
    }
}
