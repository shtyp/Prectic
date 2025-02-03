package org.college.practice2.task4;

public class SysLogNotifier implements Observer {
    private String journalName;

    public SysLogNotifier(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("SysLog Notification: " + alert.getMessage());
    }
}

