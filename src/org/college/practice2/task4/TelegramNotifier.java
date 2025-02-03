package org.college.practice2.task4;

public class TelegramNotifier implements Observer {
    private String userId;
    private boolean isInstant;

    public TelegramNotifier(String userId, boolean isInstant) {
        this.userId = userId;
        this.isInstant = isInstant;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Telegram Notification: " + alert.getMessage());
    }
}

