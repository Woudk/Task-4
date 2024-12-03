package org.colleg.practice2.task4;

import java.util.ArrayList;
import java.util.List;
public class SystemController extends Observable{
    private List<SystemAlert> alertHistory = new ArrayList<>();

    public void informAlert(SystemAlert alert) {
        alertHistory.add(alert);
        notifyAlert(alert);
    }

    public void addAlert(SystemAlert alert) {
        alertHistory.add(alert);
    }
}
