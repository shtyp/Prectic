package org.college.practice2.taks3;

import java.util.ArrayList;
import java.util.List;

class WindowController {
    private List<AbstractCommand> commands = new ArrayList<>();
    private List<AbstractCommand> commandHistory = new ArrayList<>();

    public void addCommand(AbstractCommand command) {
        commands.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commands.remove(command);
    }

    public void executeAllPendingCommands() {
        for (AbstractCommand command : commands) {
            command.execute();
            commandHistory.add(command);
        }
        commands.clear();
    }

    public void undoAllChanges() {
        for (int i = commandHistory.size() - 1; i >= 0; i--) {
            commandHistory.get(i).undo();
        }
        commandHistory.clear();
    }
}

