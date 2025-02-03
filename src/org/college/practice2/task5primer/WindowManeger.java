package org.college.practice2.task5primer;

class WindowManager {
    private Window window;

    public WindowManager(String title) {
        this.window = new Window(title);
    }

    public void addComponent(WindowComponent component) {
        window.addComponent(component);
    }

    public void draw() {
        window.draw();
    }
}
