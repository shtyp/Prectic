package org.college.practice2.task8;

class FarmField {
    private Farmer owner;
    private double area;
    private FarmFieldType type;

    public FarmField(Farmer owner, double area, FarmFieldType type) {
        this.owner = owner;
        this.area = area;
        this.type = type;
    }

    public String accept(FarmFieldVisitor visitor) {
        return visitor.visitFarmField(this);
    }
}
