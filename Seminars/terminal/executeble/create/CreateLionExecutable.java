package terminal.executeble.create;

import java.util.ArrayList;
import java.util.Random;

import animals.*;
import terminal.command.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable{

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Command inputCommand) {
        this.zoo = zoo;
        ArrayList<String> inp = inputCommand.getParameters();
        this.lion = new Lion(inp.get(0), Integer.parseInt(inp.get(1)), 
                            Integer.parseInt(inp.get(2)), 4, Integer.parseInt(inp.get(3)));
    }

    public CreateLionExecutable() {

    }

    public CreateLionExecutable getZoo(Zoo zoo, Command command){
        return new CreateLionExecutable(zoo, command);
    }

    @Override
    public void execute() {
        this.zoo.addLion(lion);

    }
    
}
