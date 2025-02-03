package org.college.practice2.task7primer;

import java.time.LocalDate;

public class SystemAlertBuilder {
    private AlertSeverity severity;
    private String message;
    private int executionCode;
    private LocalDate timestamp;
    private String process;
    private AlertSeverity alertSeverity;
    private int string;
    private LocalDate now;
    private String mainProcess;
    private String s;
    private int i;

    public SystemAlertBuilder setSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    public SystemAlertBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public SystemAlertBuilder setExecutionCode(int executionCode) {
        this.executionCode = executionCode;
        return this;
    }

    public SystemAlertBuilder setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public SystemAlertBuilder setProcess(String process) {
        this.process = process;
        return this;
    }

    public SystemAlertBuilder setAlertSeverity(AlertSeverity alertSeverity) {
        this.alertSeverity = alertSeverity;
        return this;
    }

    public SystemAlertBuilder setString(int string) {
        this.string = string;
        return this;
    }

    public SystemAlertBuilder setNow(LocalDate now) {
        this.now = now;
        return this;
    }

    public SystemAlertBuilder setMainProcess(String mainProcess) {
        this.mainProcess = mainProcess;
        return this;
    }

    public SystemAlertBuilder setS(String s) {
        this.s = s;
        return this;
    }

    public SystemAlertBuilder setI(int i) {
        this.i = i;
        return this;
    }

    public SystemAlert createSystemAlert() {
        return new SystemAlert(severity, message, executionCode, timestamp, process);
    }
}