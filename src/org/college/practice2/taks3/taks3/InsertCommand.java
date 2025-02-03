package org.college.practice2.taks3.taks3;

class InsertCommand extends AbstractCommand {
    private String text;

    public InsertCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println("Executing Insert Command: " + text);
    }

    @Override
    public void undo() {
        System.out.println("Undo Insert Command: " + text);
    }
}

