package org.college.practice2.task3;

class AddCropCommand extends AbstractCommand {
    private String cropName;
    private int cropQuantity;

    public AddCropCommand(String cropName, int cropQuantity) {
        this.cropName = cropName;
        this.cropQuantity = cropQuantity;
    }

    @Override
    public void execute() {
        System.out.println("Added crop: " + cropName + ", Quantity: " + cropQuantity);
    }

    @Override
    public void undo() {
        System.out.println("Undo adding crop: " + cropName);
    }
}

