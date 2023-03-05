package terminal;

import terminal.executeble.CommandExecutable;
import terminal.executeble.CommandExecutableFactoryImpl;
import zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }

    @Override
    public CommandExecutable create(Command inputCommand) {
        System.out.println("begin");
        CommandExecutable com = super.create(inputCommand);
        System.out.println("end");
        return com;
    }
    
}
