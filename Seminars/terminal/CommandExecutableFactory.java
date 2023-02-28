package terminal;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import zoo.Zoo;

public class CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo){
        this.zoo = zoo;
    }

    public CommandExecutable create (String[] inputCommand){
        String txt = inputCommand[0] + inputCommand[1];
        switch (txt){
            case "Lioncreate" -> {
                Lion lion = new Lion(Integer.parseInt(inputCommand[3]), Integer.parseInt(inputCommand[4]), 4, inputCommand[2], Integer.parseInt(inputCommand[5]));
                return new CreateLionExecutable(zoo, lion);
                //тип животного + create + имя + возраст + вес + параметр на выбор(длина гривы, длина тела, цвет шерсти). Например lion create Simba 12 80 100
            }
            case "Liondelete" -> {
                return new DeleteLionExecutable(zoo);
            }
            
            case "Wolfcreate" -> {
                Wolf wolf = new Wolf(Integer.parseInt(inputCommand[3]), Integer.parseInt(inputCommand[4]), 4, inputCommand[2], "Black");
                CreateWolfExecutable wlfc = new CreateWolfExecutable(zoo, wolf);
                wlfc.execute();
                return wlfc;
            }
            case "Wolfdelete" -> {
                DeleteWolfExecutable wlfd = new DeleteWolfExecutable(zoo);
                wlfd.execute();
                return wlfd;
            }

            case "snakecreate" -> {
                Snake snake = new Snake(Integer.parseInt(inputCommand[3]), Integer.parseInt(inputCommand[4]), 0, inputCommand[2], Integer.parseInt(inputCommand[5]));
                return new CreateSnakeExecutable(zoo, snake);
            }
            case "snakedelete" -> {
                return new DeleteSnakeExecutable(zoo);
            }
            
            case "showWolfcage" -> {
                zoo.printWolfCage();
                return null;
            }

            default -> {
                return null;
            } 
        }
    }
    
}
