package org.college.practice2.task7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IWrapper notifier = new EmailNotifierWrapper(
                new TelegramNotifierWrapper(null, "@farmer123", true), "farm_admin@example.com"
        );
        FarmManagementSystem farmSystem = new FarmManagementSystem(notifier);

        FarmOperation operation = new FarmOperation(FarmOperationType.HARVESTING, "Harvesting wheat in field 5", 5, LocalDate.now(), "John Doe");
        farmSystem.addOperation(operation);
    }
}
