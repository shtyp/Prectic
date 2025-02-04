package org.college.practice2.task8primer;

import java.time.LocalDateTime;

class User {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private Address address;

    public User(String firstName, String lastName, LocalDateTime birthDate, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
    }
}
