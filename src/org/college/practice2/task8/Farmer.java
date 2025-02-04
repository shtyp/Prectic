package org.college.practice2.task8;

import java.time.LocalDateTime;

class Farmer {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private Address address;

    public Farmer(String firstName, String lastName, LocalDateTime birthDate, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
    }
}
