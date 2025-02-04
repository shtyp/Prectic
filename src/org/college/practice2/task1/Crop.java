package org.college.practice2.task1;

class Crop {
    private String name;
    private int year;
    private String farmer;

    public Crop(String name, int year, String farmer) {
        this.name = name;
        this.year = year;
        this.farmer = farmer;
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

    @Override
    public String toString() {
        return "Crop{name='" + name + "', year=" + year + ", farmer='" + farmer + "'}";
    }
}
