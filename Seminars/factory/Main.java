package factory;

import java.util.ArrayList;

import animals.*;
import cage.*;
import factory.*;

public class Main {

    public static void main(String[] args) {

        //L2();
        
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

        Wolf whiteFang = new Wolf(10, 50, 15, "Белый клык", "White");

        ArrayList<Wolf> wolfs = WolfsFactory.createLions(2);

        WolfCage wolfsInCage = new WolfCage();

        wolfsInCage.addAnimal(whiteFang);

        for (Wolf wolf : wolfs) {
            wolfsInCage.addAnimal(wolf);
            wolf.Feed(5);
        }

        System.out.println();
        System.out.println(wolfsInCage);

        WolfCage.sortWolfsWeight();
        System.out.println();
        System.out.println("Сортировка по весу");
        System.out.println(wolfsInCage);

        wolfsInCage.sortWolfsByAge();
        System.out.println();
        System.out.println("Сортировка по возрасту");
        System.out.println(wolfsInCage);
        

    }

    
    
}
