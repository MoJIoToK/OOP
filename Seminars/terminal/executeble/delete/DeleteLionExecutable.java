package terminal.executeble.delete;

import terminal.command.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable{

    private Zoo zoo;

    public DeleteLionExecutable(){

    }

    public DeleteLionExecutable zooCommand(Zoo zoo, Command command){
        return new DeleteLionExecutable(zoo);
    }

    public DeleteLionExecutable(Zoo zoo){
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.takeOfLion();
    }
    
}
