package terminal;

import java.util.Scanner;
import terminal.*;
import terminal.executeble.CommandExecutable;
import terminal.executeble.CommandExecutableFactoryImpl;
import terminal.parser.CommandParser;
import zoo.Zoo;

public class TerminalReader {
    
    private static TerminalReader terminalReader;
    private CommandParser commandParser;
    private CommandExecutable commandExecutable;
    private Zoo zoo;

    private TerminalReader(CommandParser commandParser){
        this.commandParser = commandParser;
    }
    
    public static TerminalReader getTerminalReader(CommandParser commandParser) {
        if(terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public void setCommandExecutable(Command command){
        this.commandExecutable = new CommandExecutableFactoryImpl(zoo).create(command);
    }

    public void endless(){
        Scanner iScanner = new Scanner(System.in); 
        System.out.println("\nПриветствую, Пользователь!");   
        
        while (true){

            Menu.printMenu();

            System.out.println(zoo.toString() + "\n");

            String input = iScanner.nextLine();
            if (input.equals("stop")) break;
                Command newCommand = this.commandParser.parseCommand(input);
                this.setCommandExecutable(newCommand);
                this.commandExecutable.execute();

        }
        iScanner.close();
    }
}
