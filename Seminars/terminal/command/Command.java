package terminal.command;

import java.util.ArrayList;

public class Command {

    private String animal;
    private String action;
    private ArrayList<String> parameters;

    public Command(String action, String animal, ArrayList<String> parameters) {
        this.action = action;
        this.animal = animal;
        this.parameters = parameters;
    }
     
    public String getAction(){
        return action;
    }

    public String getAnimal(){
        return animal;
    }

    public ArrayList<String> getParameters(){
        return parameters;
    }     
    
    public CommandEnum getCommandEnum(){
        for (CommandEnum el: CommandEnum.values()){
            if(el.checkType(this.action, this.animal)){
                return (CommandEnum) el;
            }
        }
        return null;
    }
    
}
