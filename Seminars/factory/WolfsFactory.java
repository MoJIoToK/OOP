package factory;

import animals.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WolfsFactory {
    public static Scanner iScanner = new Scanner(System.in);

    static public ArrayList<Wolf> createWolfs (int wolfCount) {
        ArrayList<Wolf> wolfsCollection = new ArrayList<>(wolfCount);
        for (int i = 0; i < wolfCount; i++) {
            Wolf wolf = new Wolf("name" + i, new Random().nextInt(50), new Random().nextInt(100), 
                                4, "Black");
            wolfsCollection.add(wolf);
        } 
        return wolfsCollection;
    }

}

