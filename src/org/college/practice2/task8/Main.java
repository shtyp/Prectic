package org.college.practice2.task8;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Украина", "Киевская область", "Киев", "Полевая", "15", "02000");
        Farmer farmer = new Farmer("Иван", "Петров", LocalDateTime.of(1980, 7, 10, 0, 0), address);
        FarmField field = new FarmField(farmer, 50.0, FarmFieldType.CROP_FIELD);

        FarmFieldVisitor inspector = new FarmFieldInspector();
        System.out.println(field.accept(inspector));

        FarmFieldVisitor statusChecker = new FarmFieldStatusVisitor();
        System.out.println(field.accept(statusChecker));
    }
}

