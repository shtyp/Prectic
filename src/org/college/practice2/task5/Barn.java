package org.college.practice2.task5;

class Barn implements FarmComponent {
    private String barnType;

    public Barn(String barnType) {
        this.barnType = barnType;
    }

    @Override
    public void display() {
        System.out.println("Barn type: " + barnType);
    }
}
