package terminal.executeble;

import terminal.Command;
import zoo.Zoo;

public interface CommandExecutableFactory {
    public CommandExecutable create (Command inputCommand);
}
