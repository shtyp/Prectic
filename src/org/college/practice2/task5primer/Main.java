package org.college.practice2.task5primer;

public class Main {
    public static void main(String[] args) {
        WindowManager manager = new WindowManager("Main Window");
        Button button1 = new Button("OK");
        Button button2 = new Button("Cancel");
        VerticalLayout layout = new VerticalLayout("Main Layout");

        layout.addComponent(button1);
        layout.addComponent(button2);
        manager.addComponent(layout);

        manager.draw();
    }
}
