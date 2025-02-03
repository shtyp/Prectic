package org.college.practice2.task3;

class UpdateCropCommand extends AbstractCommand {
    private String cropName;
    private int newQuantity;

    public UpdateCropCommand(String cropName, int newQuantity) {
        this.cropName = cropName;
        this.newQuantity = newQuantity;
    }

    @Override
    public void execute() {
        System.out.println("Updated crop: " + cropName + " to new quantity: " + newQuantity);
    }

    @Override
    public void undo() {
        System.out.println("Undo update of crop: " + cropName);
    }
}