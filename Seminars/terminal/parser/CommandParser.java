package terminal.parser;

import java.util.ArrayList;

import terminal.Command;

public interface CommandParser {

    public default Command parseCommand(String inputCommand){
        String[] commandString = inputCommand.split("\\s+");
        
        String action = commandString[0];
        String animal = commandString[1];
        ArrayList<String> parameters = new ArrayList<>();

        if(commandString.length == 6){
            for (int i = 2; i < commandString.length; i++) {
                parameters.add(i - 2, commandString[i]);
            }
        }
        else {
            parameters.add(0, " ");
        }

        return new Command(action, animal, parameters);
    }
 
}
