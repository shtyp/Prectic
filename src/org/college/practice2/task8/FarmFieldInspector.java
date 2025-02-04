package org.college.practice2.task8;

class FarmFieldInspector implements FarmFieldVisitor {
    public String visitFarmField(FarmField field) {
        return "Inspecting farm field: " + field;
    }
}
