package org.college.practice2.task3;

class RemoveCropCommand extends AbstractCommand {
    private String cropName;

    public RemoveCropCommand(String cropName) {
        this.cropName = cropName;
    }

    @Override
    public void execute() {
        System.out.println("Removed crop: " + cropName);
    }

    @Override
    public void undo() {
        System.out.println("Undo removing crop: " + cropName);
    }
}

