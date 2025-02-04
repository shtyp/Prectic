package org.college.practice2.task4primer;

class SyslogNotifier implements Observer {
    private String logServer;

    public SyslogNotifier(String logServer) {
        this.logServer = logServer;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Logging to syslog server " + logServer + ": " + alert);
    }
}
