package factory;

import java.util.ArrayList;

import animalUtils.AnimalUtils;
import animals.*;
import cage.*;
import factory.*;
import terminal.TerminalReader;
import zoo.Zoo;

public class Main {

    public static void main(String[] args) {
        
        // Lion simba = new Lion(10, 140, 15, "Simba", 200);
        // //System.out.println(simba);
        
        // ArrayList<Lion> lions = LionsFactory.createLions(3);
        // //System.out.println(lions);

        // LionCage lionsInCage = new LionCage();

        // lionsInCage.addAnimal(simba);

        // for (Lion lion : lions) {
        //     lionsInCage.addAnimal(lion);
        //     lion.Feed(5);
        // }

        // System.out.println();
        // System.out.println(lionsInCage);

        // //lionsInCage.sortLionsByVolumeHair();
        // //System.out.println(lionsInCage);

        // lionsInCage.takeOfAnimal();
        // System.out.println(lionsInCage);
        
        // simba.Feed(10);

        ArrayList<Wolf> wolfs = WolfsFactory.createWolfs(4);
        WolfCage wolfsInCage = new WolfCage();

        for (Wolf wolf : wolfs) {
            wolfsInCage.addAnimal(wolf);
        }

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
        TerminalReader.getTerminalReader().endless(zoo);

        // System.out.println();
        // WolfCage.sortWolfsWeightAge();
        // System.out.println(wolfs);


        // AnimalUtils.sortAnimals(wolfs);
        // System.out.println();
        // System.out.println(wolfs);

        // WolfCage.sortWolfsWeight();
        // System.out.println();
        // System.out.println("Сортировка по весу");
        // System.out.println(wolfsInCage);

        // WolfCage.sortWolfsByAge();
        // System.out.println();
        // System.out.println("Сортировка по возрасту");
        // System.out.println(wolfsInCage);

        // WolfCage.sortWolfsWeightAge();
        // System.out.println();
        // System.out.println("Сортировка по возрасту и весу");
        // System.out.println(wolfsInCage);
        
    }

}
