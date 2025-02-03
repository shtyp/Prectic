package org.college.practice2.task3;

public class Main {
    public static void main(String[] args) {
        FarmController controller = new FarmController();

        AddCropCommand addWheat = new AddCropCommand("Wheat", 100);
        RemoveCropCommand removeCorn = new RemoveCropCommand("Corn");
        UpdateCropCommand updateRice = new UpdateCropCommand("Rice", 150);

        controller.addCommand(addWheat);
        controller.addCommand(removeCorn);
        controller.addCommand(updateRice);

        System.out.println("Executing all farm commands:");
        controller.executeAllPendingCommands();

        System.out.println("\nUndoing all farm commands:");
        controller.undoAllChanges();
    }

