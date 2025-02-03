package org.college.practice2.task4;

import java.time.LocalDate;

public class FarmManagementSystem {
    public static void main(String[] args) {

        SystemController systemController = new SystemController();
        EmailNotifier emailNotifier = new EmailNotifier("EmailNotifier1");
        TelegramNotifier telegramNotifier = new TelegramNotifier("User123", true);
        SysLogNotifier sysLogNotifier = new SysLogNotifier("FarmLog");
        PhoneNotifier phoneNotifier = new PhoneNotifier("+1234567890");


        systemController.subscribe(emailNotifier);
        systemController.subscribe(telegramNotifier);
        systemController.subscribe(sysLogNotifier);
        systemController.subscribe(phoneNotifier);


        SystemAlert alert1 = new SystemAlert(AlertSeverity.WARNING, "Weather alert: Storm incoming", 101, LocalDate.now(), "Weather Monitor");
        systemController.addAlert(alert1);

        SystemAlert alert2 = new SystemAlert(AlertSeverity.ERROR, "Machine failure: Tractor malfunction", 102, LocalDate.now(), "Tractor System");
        systemController.addAlert(alert2);
    }
}
