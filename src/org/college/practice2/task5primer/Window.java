package org.college.practice2.task5primer;

import java.util.ArrayList;
import java.util.List;

class Window implements WindowComponent {
    private String title;
    private List<WindowComponent> nestedComponents = new ArrayList<>();

    public Window(String title) {
        this.title = title;
    }

    public void addComponent(WindowComponent component) {
        nestedComponents.add(component);
    }

    public void removeComponent(WindowComponent component) {
        nestedComponents.remove(component);
    }

    @Override
    public void draw() {
        System.out.println("Drawing window: " + title);
        for (WindowComponent component : nestedComponents) {
            component.draw();
        }
    }
}
