package org.college.practice2.task3primer;

class CutCommand extends AbstractCommand {
    private String text;

    public CutCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println("Executing Cut Command: " + text);
    }

    @Override
    public void undo() {
        System.out.println("Undo Cut Command: " + text);
    }
}
