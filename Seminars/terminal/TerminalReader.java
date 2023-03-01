package terminal;

import java.util.Scanner;

import zoo.Zoo;

public class TerminalReader {
    
    private static TerminalReader terminalReader;
    private CommandParser commandParser;
    private CommandExecutableFactory_copy execFactory;
    
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
                "Для добавления животного в клетку введите через пробел: тип животного + create + имя + возраст + вес + параметр на выбор(длина гривы, длина тела, цвет шерсти). Например Lion create Simba 12 80 100\n" +
                "Для удаления животного введите через пробел: тип животного + delete. Например, Lion delete - удаление льва\n" + 
                "Для вывода на экран всех обитателей клетки введите через пробел: show (lion/wolf/snake)cage. Например, show Lioncage - показать клетку со львами\n" +
                "Для выхода из программы введите - stop\n");

            String input = iScanner.nextLine();


            if(input.equals("stop")) break;

            String[] inputCommand = CommandParser.parseCommand(input);
            
            CommandExecutableFactory command = new CommandExecutableFactory(zoo);
            command.create(inputCommand);

        }
        iScanner.close();
    }


}
