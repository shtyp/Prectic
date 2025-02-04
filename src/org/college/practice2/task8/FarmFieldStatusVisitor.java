package org.college.practice2.task8;

class FarmFieldStatusVisitor implements FarmFieldVisitor {
    public String visitFarmField(FarmField field) {
        return "Checking field status: " + field;
    }
}
