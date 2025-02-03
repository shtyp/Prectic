package org.college.practice2.task7primer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IWrapper notifier = new EmailNotifierWrapper(
                new TelegramNotifierWrapper(null, "@user123", true), "admin@example.com"
        );
        SystemController controller = new SystemController(notifier);

        SystemAlert alert = new SystemAlert(AlertSeverity.ERROR, "Critical system failure!", 500, LocalDate.now(), "MainProcess");
        controller.addAlert(alert);
    }
}