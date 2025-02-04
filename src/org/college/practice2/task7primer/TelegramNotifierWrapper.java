package org.college.practice2.task7primer;

class TelegramNotifierWrapper extends NotifierWrapper {
    public TelegramNotifierWrapper(IWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void notify(SystemAlert alert) {
        super.notify(alert);
        System.out.println("Telegram уведомление отправлено: " + alert);
    }
}
