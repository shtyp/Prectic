package org.college.practice2.task6;

import java.time.LocalDate;

class FarmRecord {
    private String recordName;
    private LocalDate recordDate;
    private String recordType;

    public FarmRecord(String recordName, LocalDate recordDate, String recordType) {
        this.recordName = recordName;
        this.recordDate = recordDate;
        this.recordType = recordType;
    }

    public String getRecordName() {
        return recordName;
    }
}
