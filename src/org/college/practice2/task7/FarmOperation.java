package org.college.practice2.task7;

import java.time.LocalDate;

public class FarmOperation {
    private FarmOperationType type;
    private String description;
    private int fieldNumber;
    private LocalDate date;
    private String responsiblePerson;

    public FarmOperation(FarmOperationType type, String description, int fieldNumber, LocalDate date, String responsiblePerson) {
        this.type = type;
        this.description = description;
        this.fieldNumber = fieldNumber;
        this.date = date;
        this.responsiblePerson = responsiblePerson;
    }

    public FarmOperationType getType() { return type; }
    public String getDescription() { return description; }
    public int getFieldNumber() { return fieldNumber; }
    public LocalDate getDate() { return date; }
    public String getResponsiblePerson() { return responsiblePerson; }
}
