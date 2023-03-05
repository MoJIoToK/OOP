package terminal.executeble.create;

import java.util.ArrayList;

import animals.*;
import terminal.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable{

    private Zoo zoo;
    private Wolf wolf;

    public CreateWolfExecutable(Zoo zoo, Command inputCommand){
        this.zoo = zoo;
        ArrayList<String> inp = inputCommand.getParameters();
        this.wolf = new Wolf("null", 0, 0, 0, null);
    }

    public CreateWolfExecutable(){

    }

    public CreateWolfExecutable getZoo(Zoo zoo, Command command){
        return new CreateWolfExecutable(zoo, command);
    }

    @Override
    public void execute() {
        this.zoo.addWolf(wolf);        
    }

}
