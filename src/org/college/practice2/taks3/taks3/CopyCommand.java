package org.college.practice2.taks3.taks3;

class CopyCommand extends AbstractCommand {
    @Override
    public void execute() {
        System.out.println("Executing Copy Command");
    }

    @Override
    public void undo() {
        System.out.println("Undo Copy Command");
    }
}
