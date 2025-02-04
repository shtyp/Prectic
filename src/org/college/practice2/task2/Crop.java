package org.college.practice2.task2;

import java.util.ArrayList;
import java.util.List;

class Crop {
    private String name;
    private int year;
    private String farmer;
    private String category;
    private String color;
    private double width;
    private double height;

    public Crop(String name, int year, String farmer, String category, String color, double width, double height) {
        this.name = name;
        this.year = year;
        this.farmer = farmer;
        this.category = category;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getFarmer() {
        return farmer;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Crop{name='" + name + "', year=" + year + ", farmer='" + farmer + "', category='" + category + "', color='" + color + "', width=" + width + ", height=" + height + "'}";
    }
}
