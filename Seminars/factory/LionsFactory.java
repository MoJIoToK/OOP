package factory;

import animals.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LionsFactory {
    public static Scanner iScanner = new Scanner(System.in);

    static public ArrayList<Lion> createLions (int lionCount) {
        ArrayList<Lion> lionsCollection = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            Lion lion = new Lion("name" + i, new Random().nextInt(50), new Random().nextInt(100), 
                                4, new Random().nextInt(5) * i);
            lionsCollection.add(lion);
        }
        
        return lionsCollection;
    }

}

