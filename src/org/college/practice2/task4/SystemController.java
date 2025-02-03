package org.college.practice2.task4;

import java.util.ArrayList;
import java.util.List;

public class SystemController extends Observable {
    private List<SystemAlert> _alertHistory = new ArrayList<>();

    public SystemController() {}

    public void addAlert(SystemAlert alert) {
        _alertHistory.add(alert);
        informAlerts();
    }

    public void informAlerts() {
        for (SystemAlert alert : _alertHistory) {
            notifyObservers(alert);
        }
    }
}

