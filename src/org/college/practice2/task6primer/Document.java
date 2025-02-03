package org.college.practice2.task6primer;

import java.time.LocalDate;

class Document {
    private String documentName;
    private LocalDate creationDate;
    private LocalDate documentFormat;
    private String osType;

    public Document(String documentName, LocalDate creationDate, LocalDate documentFormat, String osType) {
        this.documentName = documentName;
        this.creationDate = creationDate;
        this.documentFormat = documentFormat;
        this.osType = osType;
    }

    public String getDocumentName() {
        return documentName;
    }
}
