package org.college.practice2.task4primer;

class SystemAlert {
    private AlertSeverity severity;
    private String message;
    private String timestamp;

    public SystemAlert(AlertSeverity severity, String message, String timestamp) {
        this.severity = severity;
        this.message = message;
        this.timestamp = timestamp;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "SystemAlert{severity=" + severity + ", message='" + message + "', timestamp='" + timestamp + "'}";
    }
}
