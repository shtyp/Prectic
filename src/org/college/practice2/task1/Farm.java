package org.college.practice2.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Farm {
    private static Map<String, Farm> instances = new HashMap<>();
    private List<Crop> crops = new ArrayList<>();
    private String name;
    private String description;

    private Farm(String name) {
        this.name = name;
    }

    public static Farm getInstance(String name) {
        return instances.computeIfAbsent(name, Farm::new);
    }

    public boolean addCrop(Crop crop) {
        return crops.add(crop);
    }

    public boolean removeCrop(Crop crop) {
        return crops.remove(crop);
    }

    public String describeCrop(Crop crop) {
        return crop.toString();
    }

    public Crop getCrop(String name) {
        return crops.stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
    }

    public List<Crop> getCrops() {
        return new ArrayList<>(crops);
    }

    public long getCropCount() {
        return crops.size();
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
