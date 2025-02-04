package org.college.practice2.task7;

import java.time.LocalDate;

class FarmAlert {
    private FarmOperationType severity;
    private String message;
    private int executionCode;
    private LocalDate timestamp;
    private String process;

    public FarmAlert(FarmOperationType severity, String message, int executionCode, LocalDate timestamp, String process) {
        this.severity = severity;
        this.message = message;
        this.executionCode = executionCode;
        this.timestamp = timestamp;
        this.process = process;
    }

    public FarmOperationType getSeverity() { return severity; }
    public String getMessage() { return message; }
    public int getExecutionCode() { return executionCode; }
    public LocalDate getTimestamp() { return timestamp; }
    public String getProcessName() { return process; }
}
