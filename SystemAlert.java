package org.colleg.practice2.task4;

import java.time.LocalDateTime;
public class SystemAlert {
    private AlertSeverity severity;
    private String message;
    private int executionCode;
    private LocalDateTime timestamp;
    private String processName;

    public SystemAlert(AlertSeverity severity, String message, int executionCode, LocalDateTime timestamp, String processName) {
        this.severity = severity;
        this.message = message;
        this.executionCode = executionCode;
        this.timestamp = timestamp;
        this.processName = processName;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getExecutionCode() {
        return executionCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getProcessName() {
        return processName;
    }
}
