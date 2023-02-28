package terminal;

import java.util.Scanner;

import zoo.Zoo;

public class TerminalReader {
    
    private static TerminalReader terminalReader;
    private static CommandParser commandParser;
    
    // boolean flag = true;

    private TerminalReader(){
        //this.commandParser = commandParser;
    }
    
    public static TerminalReader getTerminalReader() {
        if(terminalReader == null) {
            terminalReader = new TerminalReader();
        }
        return terminalReader;
    }

    public void endless(Zoo zoo){
        Scanner iScanner = new Scanner(System.in); 
        System.out.println("\nПриветствую, Пользователь!");   
        
        while (true){
            System.out.println("\nВведите желаемое действие: \n" +
                "Для добавления животного в клетку введите через пробел: тип животного + create + имя + возраст + вес + параметр на выбор(длина гривы, длина тела, цвет шерсти). Например lion create Simba 12 80 100\n" +
                "Для удаления животного введите через пробел: тип животного + delete. Например, lion delete - удаление льва\n" + 
                "Для вывода на экран всех обитателей клетки введите через пробел: show (lion/wolf/snake)cage. Например, show lioncage - показать клетку со львами\n" +
                "Для выхода из программы введите - stop\n");

            String input = iScanner.nextLine();

            if(input.equals("stop")) break;

            String[] inputCommand = CommandParser.parseCommand(input);
            
            //if(inputCheck(inputCommand)){
                CommandExecutableFactory command = new CommandExecutableFactory(zoo);
                command.create(inputCommand);
            // }
            // else {
            //     System.out.println("Комманда введена некорректно! Попробуйте снова!\n");
            // }
        }
        iScanner.close();
    }

    // boolean inputCheck(String[] inputCommand) {
    //     if (inputCommand.length != 2 && inputCommand.length != 6) return false;
    //     else if (inputCommand[0].equals("wolf") && inputCommand[0].equals("lion") && inputCommand[0].equals("snake")) return false;
    //     else if (inputCommand[1].equals("delete") && inputCommand[1].equals("create")) return false;
    //     else if (inputCommand.length == 6 && (!inputCommand[3].matches("\\d+") ||
    //             !inputCommand[4].matches("\\d+") ||
    //             !inputCommand[5].matches("\\d+"))) return false;
    //     return true;
    // }

    


}
