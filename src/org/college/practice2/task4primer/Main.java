package org.college.practice2.task4primer;

public class Main {
    public static void main(String[] args) {
        SystemController system = new SystemController();

        EmailNotifier emailNotifier = new EmailNotifier("admin@example.com");
        SyslogNotifier syslogNotifier = new SyslogNotifier("syslog.example.com");
        PhoneNotifier phoneNotifier = new PhoneNotifier("+1234567890");

        system.addObserver(emailNotifier);
        system.addObserver(syslogNotifier);
        system.addObserver(phoneNotifier);

        SystemAlert alert = new SystemAlert(AlertSeverity.ERROR, "Disk space is low", "2025-02-09 12:00:00");
        system.notifyObservers(alert);
    }
}
