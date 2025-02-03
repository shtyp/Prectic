package org.college.practice2.task7primer;

import java.util.ArrayList;
import java.util.List;

class SystemController {
    private List<SystemAlert> alertHistory = new ArrayList<>();
    private IWrapper notifier;

    public SystemController(IWrapper notifier) {
        this.notifier = notifier;
    }

    public void addAlert(SystemAlert alert) {
        alertHistory.add(alert);
        notifier.notify(alert);
    }
}