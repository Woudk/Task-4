package org.colleg.practice2.task4;

public class PhoneNotifier implements Observer{
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("PhoneNotifier [" + phoneNumber + "] received alert: " + alert.getMessage());
    }
}
