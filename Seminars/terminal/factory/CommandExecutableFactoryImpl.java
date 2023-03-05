package terminal.factory;

import terminal.*;
import terminal.command.Command;
import terminal.command.CommandEnum;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command input) {
        CommandEnum codeEnum = input.getCommandEnum();
        CommandExecutable exec = codeEnum.getMethod();
        return exec.getZoo(zoo, input);
    }

    
}
