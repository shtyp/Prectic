package org.college.practice2.task7primer;

class TelegramNotifierWrapper extends AlertNotifierWrapper {
    private String userId;
    private boolean isInstant;

    public TelegramNotifierWrapper(IWrapper wrapper, String userId, boolean isInstant) {
        super(wrapper);
        this.userId = userId;
        this.isInstant = isInstant;
    }

    @Override
    public void notify(SystemAlert alert) {
        super.notify(alert);
        System.out.println("[Telegram] " + userId + " -> " + alert.getMessage());
    }
}
