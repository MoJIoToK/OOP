package terminal.executeble.create;

import java.util.ArrayList;
import animals.*;
import terminal.command.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable{

    private Zoo zoo;
    private Wolf wolf;

    public CreateWolfExecutable(){

    }

    public CreateWolfExecutable zooCommand(Zoo zoo, Command command){
        return new CreateWolfExecutable(zoo, command);
    }

    public CreateWolfExecutable(Zoo zoo, Command inputCommand){
        this.zoo = zoo;
        ArrayList<String> inp = inputCommand.getParameters();
        this.wolf = new Wolf(inp.get(0), Integer.parseInt(inp.get(1)), Integer.parseInt(inp.get(2)), 
                            4, inp.get(3));
    }

    @Override
    public void execute() {
        this.zoo.addWolf(wolf);        
    }

}
