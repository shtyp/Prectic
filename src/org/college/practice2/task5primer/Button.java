package org.college.practice2.task5primer;

class Button implements WindowComponent {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void draw() {
        System.out.println("Drawing button: " + label);
    }
}
