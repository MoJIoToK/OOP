package factory;

import java.util.ArrayList;

import animals.*;
import cage.*;
import factory.*;

public class Main {

    public static void main(String[] args) {

        //L2();
        
        Wolf simba = new Wolf(10, 140, 15, "Simba", 200);
        //System.out.println(simba);
        simba.Feed(10);
        
        ArrayList<Wolf> lions = LionsFactory.createLions(3);
        //System.out.println(lions);

        WolfCage lionsInCage = new WolfCage();

        lionsInCage.addAnimal(simba);

        for (Wolf lion : lions) {
            lionsInCage.addAnimal(lion);
            //System.out.println(lion);
        }
        System.out.println();
        System.out.println(lionsInCage);

        lionsInCage.takeOfAnimal();
        System.out.println(lionsInCage);
    }

    
    
}
