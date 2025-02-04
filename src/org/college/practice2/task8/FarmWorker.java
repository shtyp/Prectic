package org.college.practice2.task8;

import java.time.LocalDateTime;

class FarmWorker {
    private String name;
    private String role;
    private LocalDateTime hireDate;

    public FarmWorker(String name, String role, LocalDateTime hireDate) {
        this.name = name;
        this.role = role;
        this.hireDate = hireDate;
    }
}
