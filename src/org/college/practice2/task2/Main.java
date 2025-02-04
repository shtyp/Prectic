package org.college.practice2.task2;

public class Main {
    public static void main(String[] args) {
        LocalCropBuilder localBuilder = new LocalCropBuilder("Wheat", 2024, "John Doe", "Grain", "Golden", 1.5, 2.0);
        Crop wheat = localBuilder.build();

        ImportedCropBuilder importedBuilder = new ImportedCropBuilder("Banana", 2024, "Jane Smith", "Fruit", "Yellow", 0.3, 1.2);
        Crop banana = importedBuilder.build();

        System.out.println(wheat);
        System.out.println(banana);
    }
}
