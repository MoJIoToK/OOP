package terminal.executeble;

import java.util.ArrayList;

import animals.*;
import cage.AnimalCage;
import cage.WolfCage;
import terminal.Command;
import zoo.Zoo;

public class PrintWolfCageExecutable implements CommandExecutable{

    private Zoo zoo;
    private Wolf wolf;
    private WolfCage cage;

    public PrintWolfCageExecutable(){

    }

    public PrintWolfCageExecutable getZoo(Zoo zoo, Command command){
        return new PrintWolfCageExecutable();
    }

    @Override
    public void execute() {
        this.zoo.printWolfCage();     
    }

}
