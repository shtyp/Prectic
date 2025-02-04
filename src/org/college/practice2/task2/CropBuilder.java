package org.college.practice2.task2;

class CropBuilder {
    protected Crop crop;

    public CropBuilder(String name, int year, String farmer, String category, String color, double width, double height) {
        this.crop = new Crop(name, year, farmer, category, color, width, height);
    }

    public Crop build() {
        return crop;
    }
}
