package factory;

import java.util.ArrayList;
import animals.*;
import cage.*;
import terminal.TerminalReader;
import terminal.parser.ZooCammandParser;
import zoo.Zoo;

public class Main {

    public static void main(String[] args) {

        ArrayList<Wolf> wolfs = WolfsFactory.createWolfs(4);
        WolfCage wolfsInCage = new WolfCage();

        for (Wolf wolf : wolfs) {
            wolfsInCage.addAnimal(wolf);
        }

        Wolf wolf1 = new Wolf("$UR", 0, 0, 0, null);
        wolfsInCage.addAnimal(wolf1);

        ArrayList<Lion> lions = LionsFactory.createLions(2);
        LionCage lionsInCage = new LionCage();

        for (Lion lion : lions) {
            lionsInCage.addAnimal(lion);
        }

        ArrayList<Snake> snakes = SnakesFactory.createSnakes(3);
        SnakeCage snakesInCage = new SnakeCage();
        
        for (Snake snake : snakes) {
            snakesInCage.addAnimal(snake);
        }

        Zoo zoo = new Zoo(wolfsInCage, lionsInCage, snakesInCage);
        TerminalReader terminal = TerminalReader.getTerminalReader(new ZooCammandParser());
        terminal.setZoo(zoo);
        terminal.endless();
        System.out.println();
    }

}
