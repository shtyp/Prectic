package org.college.practice2.task5;

class Field implements FarmComponent {
    private String cropType;

    public Field(String cropType) {
        this.cropType = cropType;
    }

    @Override
    public void display() {
        System.out.println("Field with crop: " + cropType);
    }
}
