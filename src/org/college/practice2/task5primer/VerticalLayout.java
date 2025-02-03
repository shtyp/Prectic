package org.college.practice2.task5primer;

class VerticalLayout implements WindowComponent {
    private String name;
    private List<WindowComponent> nestedComponents = new ArrayList<>();

    public VerticalLayout(String name) {
        this.name = name;
    }

    public void addComponent(WindowComponent component) {
        nestedComponents.add(component);
    }

    public void removeComponent(WindowComponent component) {
        nestedComponents.remove(component);
    }

    @Override
    public void draw() {
        System.out.println("Drawing vertical layout: " + name);
        for (WindowComponent component : nestedComponents) {
            component.draw();
        }
    }
}
