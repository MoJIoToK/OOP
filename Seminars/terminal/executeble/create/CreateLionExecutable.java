package terminal.executeble.create;

import java.util.ArrayList;
import animals.*;
import terminal.command.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable{

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable() {

    }

    public CreateLionExecutable zooCommand(Zoo zoo, Command command){
        return new CreateLionExecutable(zoo, command);
    }

    public CreateLionExecutable(Zoo zoo, Command inputCommand) {
        this.zoo = zoo;
        ArrayList<String> inp = inputCommand.getParameters();
        this.lion = new Lion(inp.get(0), Integer.parseInt(inp.get(1)), 
                            Integer.parseInt(inp.get(2)), 4, Integer.parseInt(inp.get(3)));
    }

    @Override
    public void execute() {
        this.zoo.addLion(lion);

    }
    
}
