package org.college.practice2.task7primer;

class EmailNotifierWrapper extends NotifierWrapper {
    public EmailNotifierWrapper(IWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void notify(SystemAlert alert) {
        super.notify(alert);
        System.out.println("Email уведомление отправлено: " + alert);
    }
}
