package terminal.executeble;

import terminal.command.Command;
import zoo.Zoo;

public interface CommandExecutable {

    void execute();

    CommandExecutable zooCommand(Zoo zoo, Command command);
    
}
