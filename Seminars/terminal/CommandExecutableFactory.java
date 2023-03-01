package terminal;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import zoo.Zoo;

public class CommandExecutableFactory{
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo){
        this.zoo = zoo;
    }

    public CommandExecutable create (String[] inputCommand){

        String txt = inputCommand[0] + inputCommand[1];
        switch (txt){
            case "Lioncreate" -> {
                Lion lion = new Lion(Integer.parseInt(inputCommand[3]), Integer.parseInt(inputCommand[4]), 4, inputCommand[2], Integer.parseInt(inputCommand[5]));
                CreateLionExecutable lnc = new CreateLionExecutable(zoo, lion);
                lnc.execute();
                System.out.println("Лев добавлен успешно!");
                return lnc;
                //тип животного + create + имя + возраст + вес + параметр на выбор(длина гривы, длина тела, цвет шерсти). Например lion create Simba 12 80 100
            }
            case "Liondelete" -> {
                DeleteLionExecutable lnd = new DeleteLionExecutable(zoo);
                lnd.execute();
                System.out.println("Лев удален успешно!");
                return lnd;
            }
            
            case "Wolfcreate" -> {
                Wolf wolf = new Wolf(Integer.parseInt(inputCommand[3]), Integer.parseInt(inputCommand[4]), 4, inputCommand[2], "Black");
                CreateWolfExecutable wlfc = new CreateWolfExecutable(zoo, wolf);
                wlfc.execute();
                System.out.println("Волк добавлен успешно!");
                return wlfc;
            }
            case "Wolfdelete" -> {
                DeleteWolfExecutable wlfd = new DeleteWolfExecutable(zoo);
                wlfd.execute();
                System.out.println("Волк удален успешно!");
                return wlfd;
            }

            case "Snakecreate" -> {
                Snake snake = new Snake(Integer.parseInt(inputCommand[3]), Integer.parseInt(inputCommand[4]), 0, inputCommand[2], Integer.parseInt(inputCommand[5]));
                CreateSnakeExecutable snkc = new CreateSnakeExecutable(zoo, snake);
                snkc.execute();
                System.out.println("Змея добавлена успешно!");
                return snkc;
            }
            case "Snakedelete" -> {
                DeleteSnakeExecutable snkd = new DeleteSnakeExecutable(zoo);
                snkd.execute();
                System.out.println("Змея удалена успешно!");
                return snkd;
            }

            case "showLioncage" -> {
                zoo.printLionCage();
                return null;
            }            

            case "showWolfcage" -> {
                zoo.printWolfCage();
                return null;
            }

            case "showSnakecage" -> {
                zoo.printSnakeCage();
                return null;
            }
            
            default -> {
                return null;
            } 
        }
    }
    
}
