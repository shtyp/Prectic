package org.college.practice2.task4primer;

class PhoneNotifier implements Observer {
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + alert);
    }
}