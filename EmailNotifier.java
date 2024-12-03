package org.colleg.practice2.task4;

public class EmailNotifier implements Observer{
    private String uniqueName;

    public EmailNotifier(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("EmailNotifier [" + uniqueName + "] received alert: " + alert.getMessage());
    }
}
