package terminal.executeble.delete;

import terminal.command.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable{

    private Zoo zoo;

    public DeleteSnakeExecutable(){
        
    }

    public DeleteSnakeExecutable zooCommand(Zoo zoo, Command command){
        return new DeleteSnakeExecutable(zoo);
    }

    public DeleteSnakeExecutable(Zoo zoo){
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.takeOfSnake();
    }

}
