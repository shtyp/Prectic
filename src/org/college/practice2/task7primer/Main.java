package org.college.practice2.task7primer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IWrapper notifier = new EmailNotifierWrapper(
                new TelegramNotifierWrapper(null)
        );

        SystemAlert alert = new SystemAlert(AlertSeverity.HIGH, "Critical system failure", 500, LocalDate.now(), "System Core");
        notifier.notify(alert);
    }
}
