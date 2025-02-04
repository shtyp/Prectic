package org.college.practice2.task1;

public class Main {
    public static void main(String[] args) {
        Farm farm = Farm.getInstance("Sunny Farm");
        farm.setDescription("Organic farm specializing in wheat and corn.");

        Crop wheat = new Crop("Wheat", 2024, "John Doe");
        Crop corn = new Crop("Corn", 2024, "Jane Smith");

        farm.addCrop(wheat);
        farm.addCrop(corn);

        System.out.println("Farm: " + farm.getName());
        System.out.println("Description: " + farm.getDescription());
        System.out.println("Total Crops: " + farm.getCropCount());

        for (Crop crop : farm.getCrops()) {
            System.out.println(farm.describeCrop(crop));
        }
    }
}

