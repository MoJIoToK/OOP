package terminal;

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
        for (CommandEnum x: CommandEnum.values())
              {
            if(x.checkType(this.action, this.animal)){
                return (CommandEnum) x;
            }
        }
        return null;
    }
    
}
