package org.college.practice2.taks3.taks3;

public class Main {
    public static void main(String[] args) {
        WindowController controller = new WindowController();

        CopyCommand copy = new CopyCommand();
        InsertCommand insert = new InsertCommand("Hello World");
        CutCommand cut = new CutCommand("Goodbye World");

        controller.addCommand(copy);
        controller.addCommand(insert);
        controller.addCommand(cut);

        System.out.println("Executing all commands:");
        controller.executeAllPendingCommands();

        System.out.println("\nUndoing all commands:");
        controller.undoAllChanges();
    }
}
