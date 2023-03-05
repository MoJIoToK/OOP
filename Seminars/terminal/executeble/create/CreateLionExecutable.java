package terminal.executeble.create;

import java.util.ArrayList;

import animals.*;
import terminal.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable{

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Command inputCommand) {
        this.zoo = zoo;
        ArrayList<String> inp = inputCommand.getParameters();
        this.lion = new Lion("name", 0, 0, 0, 0);
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
