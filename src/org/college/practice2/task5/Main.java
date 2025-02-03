package org.college.practice2.task5;

public class Main {
    public static void main(String[] args) {
        FarmManager manager = new FarmManager("Green Valley Farm");
        Field wheatField = new Field("Wheat");
        Field cornField = new Field("Corn");
        Barn dairyBarn = new Barn("Dairy Barn");

        manager.addComponent(wheatField);
        manager.addComponent(cornField);
        manager.addComponent(dairyBarn);

        manager.displayFarm();
    }
}
