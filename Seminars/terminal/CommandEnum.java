package terminal;

import animals.Animal;
import terminal.*;
import terminal.executeble.CommandExecutable;
import terminal.executeble.DeleteLionExecutable;
import terminal.executeble.DeleteSnakeExecutable;
import terminal.executeble.DeleteWolfExecutable;
import terminal.executeble.PrintWolfCageExecutable;
import terminal.executeble.create.CreateLionExecutable;
import terminal.executeble.create.CreateSnakeExecutable;
import terminal.executeble.create.CreateWolfExecutable;
import zoo.Zoo;

public enum CommandEnum {
    CREATE_WOLF("createwolf", new CreateWolfExecutable()),
    DELETE_WOLF("deletewolf", new DeleteWolfExecutable()),
    
    CREATE_SNAKE("createsnake", new CreateSnakeExecutable()),
    DELETE_SNAKE("deletesnake", new DeleteSnakeExecutable()),
    
    CREATE_LION("createlion", new CreateLionExecutable()),
    DELETE_LION("deletelion", new DeleteLionExecutable()),

    //SHOW_WOLF("showwolf", new PrintWolfCageExecutable()),
    // SHOW_LIONCAGE(),
    // SHOW_SNAKECAGE(),

    // SHOW_ZOO(),

    ;
    
    private final String action_animal;
    private CommandExecutable method;
    private String txt;
    

    CommandEnum(String textCommand, CommandExecutable method) {
        this.action_animal = textCommand;
        this.method = method;
    }

    CommandEnum(String textCommand, String txt) {
        this.action_animal = textCommand;
    }

    public String getAction_animal() {
        return action_animal;
    }

    public CommandExecutable getMethod() {
        return method;
    }

    public boolean checkType(String action, String animal){
        return action_animal.equals(action + animal);
    }

}