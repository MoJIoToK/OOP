package terminal.executeble.delete;

import terminal.command.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable{

    private Zoo zoo;

    public DeleteWolfExecutable(){

    }

    public DeleteWolfExecutable zooCommand(Zoo zoo, Command command){
        return new DeleteWolfExecutable(zoo);
    }

    public DeleteWolfExecutable(Zoo zoo){
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.takeOfWolf();
    }

}
