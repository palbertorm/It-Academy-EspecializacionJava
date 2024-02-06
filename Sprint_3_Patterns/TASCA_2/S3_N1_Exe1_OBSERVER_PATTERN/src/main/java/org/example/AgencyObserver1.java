package org.example;

public class AgencyObserver1 extends Observable{
    public AgencyObserver1(SubjectAgentBolsa subjectAgentBolsa) {
        this.subjectAgentBolsa = subjectAgentBolsa;
        this.subjectAgentBolsa.attachObservers(this);
    }
    @Override
    public void update(){
        System.out.println(" agency 1: " + Integer.sum(5, subjectAgentBolsa.getStateBolsa()));
    }
}
