package terminal.executeble;

import terminal.command.Command;
import zoo.Zoo;

public class PrintZoo implements CommandExecutable{

    private Zoo zoo;

    public PrintZoo() {

    }    

    public PrintZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.printZoo();
    }

    @Override
    public CommandExecutable zooCommand(Zoo zoo, Command command) {
        return new PrintZoo(zoo);
    }
    
}
