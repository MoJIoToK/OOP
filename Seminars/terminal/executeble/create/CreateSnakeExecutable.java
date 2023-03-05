package terminal.executeble.create;

import java.util.ArrayList;

import animals.*;
import terminal.Command;
import terminal.executeble.CommandExecutable;
import zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable {

    private Zoo zoo;
    private Snake snake;

    public CreateSnakeExecutable(Zoo zoo, Command inputCommand){
        this.zoo = zoo;
        ArrayList<String> inp = inputCommand.getParameters();
        this.snake = new Snake("null", 0, 0, 0, 0);
    }

    public CreateSnakeExecutable(){

    }

    public CreateSnakeExecutable getZoo(Zoo zoo, Command command){
        return new CreateSnakeExecutable(zoo, command);
    }

    @Override
    public void execute() {
        this.zoo.addSnake(snake);
    }

}
