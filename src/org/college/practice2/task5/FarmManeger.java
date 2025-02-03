package org.college.practice2.task5;

class FarmManager {
    private Farm farm;

    public FarmManager(String name) {
        this.farm = new Farm(name);
    }

    public void addComponent(FarmComponent component) {
        farm.addComponent(component);
    }

    public void displayFarm() {
        farm.display();
    }
}
