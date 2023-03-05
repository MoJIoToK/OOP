package terminal.factory;

import terminal.command.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public interface CommandExecutableFactory {
    public CommandExecutable create (Command inputCommand);
}
