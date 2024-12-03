package org.colleg.practice2.task4;

import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        SystemController controller = new SystemController();

        EmailNotifier emailNotifier = new EmailNotifier("google@gmail.com");
        TelegramNotifier telegramNotifier = new TelegramNotifier("@boss", true);
        SysLogNotifier sysLogNotifier = new SysLogNotifier("SystemJournal");
        PhoneNotifier phoneNotifier = new PhoneNotifier("+0975863456");

        controller.subscribe(emailNotifier);
        controller.subscribe(telegramNotifier);
        controller.subscribe(sysLogNotifier);
        controller.subscribe(phoneNotifier);

        SystemAlert alert = new SystemAlert(AlertSeverity.CRITICAL, "System failure!", 101, LocalDateTime.now(), "MainProcess");
        controller.informAlert(alert);
    }
}