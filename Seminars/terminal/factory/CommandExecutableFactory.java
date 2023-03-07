package terminal.factory;

import terminal.command.Command;
import terminal.executeble.CommandExecutable;


public interface CommandExecutableFactory {
    public CommandExecutable create (Command inputCommand);
}
