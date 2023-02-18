package factory;

import java.util.ArrayList;

import animals.*;
import cage.*;
import factory.*;

public class Main {

    public static void main(String[] args) {

        //L2();
        
        Lion simba = new Lion(10, 140, 15, "Simba", 200);
        //System.out.println(simba);
        
        
        ArrayList<Lion> lions = LionsFactory.createLions(3);
        //System.out.println(lions);

        LionCage lionsInCage = new LionCage();

        lionsInCage.addAnimal(simba);

        for (Lion lion : lions) {
            lionsInCage.addAnimal(lion);
            lion.Feed(5);
        }

        System.out.println();
        System.out.println(lionsInCage);

        //lionsInCage.sortLionsByVolumeHair();
        //System.out.println(lionsInCage);

        lionsInCage.takeOfAnimal();
        System.out.println(lionsInCage);
        
        //simba.Feed(10);


    }

    
    
}
