package org.college.practice2.task5;

import java.util.ArrayList;
import java.util.List;

class Farm implements FarmComponent {
    private String name;
    private List<FarmComponent> components = new ArrayList<>();

    public Farm(String name) {
        this.name = name;
    }

    public void addComponent(FarmComponent component) {
        components.add(component);
    }

    public void removeComponent(FarmComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Farm: " + name);
        for (FarmComponent component : components) {
            component.display();
        }
    }
}
