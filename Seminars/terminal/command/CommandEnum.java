package terminal.command;

import terminal.executeble.CommandExecutable;
import terminal.executeble.PrintZoo;
import terminal.executeble.create.CreateLionExecutable;
import terminal.executeble.create.CreateSnakeExecutable;
import terminal.executeble.create.CreateWolfExecutable;
import terminal.executeble.delete.DeleteLionExecutable;
import terminal.executeble.delete.DeleteSnakeExecutable;
import terminal.executeble.delete.DeleteWolfExecutable;

public enum CommandEnum {
    CREATE_WOLF("createwolf", new CreateWolfExecutable()),
    DELETE_WOLF("deletewolf", new DeleteWolfExecutable()),
    
    CREATE_SNAKE("createsnake", new CreateSnakeExecutable()),
    DELETE_SNAKE("deletesnake", new DeleteSnakeExecutable()),
    
    CREATE_LION("createlion", new CreateLionExecutable()),
    DELETE_LION("deletelion", new DeleteLionExecutable()),

    SWOW_ZOO("showzoo", new PrintZoo()),
    ;
    
    private final String action_animal;
    private CommandExecutable method;
    
    CommandEnum(String textCommand, CommandExecutable method) {
        this.action_animal = textCommand;
        this.method = method;
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