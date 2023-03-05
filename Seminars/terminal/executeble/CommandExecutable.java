package terminal.executeble;

import animals.Animal;
import terminal.Command;
import zoo.Zoo;

public interface CommandExecutable {

    void execute();

    CommandExecutable getZoo(Zoo zoo, Command command);
    
}
