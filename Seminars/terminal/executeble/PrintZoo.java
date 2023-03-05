package terminal.executeble;

import animals.Wolf;
import cage.AnimalCage;
import cage.WolfCage;
import terminal.command.Command;
import zoo.Zoo;

public class PrintZoo implements CommandExecutable{

    private Zoo zoo;
        
    public PrintZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public PrintZoo() {

    }

    @Override
    public void execute() {
        zoo.printZoo();
    }

    @Override
    public CommandExecutable getZoo(Zoo zoo, Command command) {
        return new PrintZoo(zoo);
    }
    
}
