package org.college.practice2.task4primer;

class EmailNotifier implements Observer {
    private String emailAddress;

    public EmailNotifier(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending email to " + emailAddress + ": " + alert);
    }
}
