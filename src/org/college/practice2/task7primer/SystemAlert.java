package org.college.practice2.task7primer;

import java.time.LocalDate;

class SystemAlert {
    private AlertSeverity severity;
    private String message;
    private int code;
    private LocalDate date;
    private String source;

    public SystemAlert(AlertSeverity severity, String message, int code, LocalDate date, String source) {
        this.severity = severity;
        this.message = message;
        this.code = code;
        this.date = date;
        this.source = source;
    }
}
