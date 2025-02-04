package org.college.practice2.task8primer;

import java.time.LocalDateTime;

class Administrator {
    private String department;
    private LocalDateTime hireDate;

    public Administrator(String department, LocalDateTime hireDate) {
        this.department = department;
        this.hireDate = hireDate;
    }
}
