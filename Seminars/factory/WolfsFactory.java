package factory;

import animals.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WolfsFactory {
    public static Scanner iScanner = new Scanner(System.in);

    static public ArrayList<Wolf> createLions (int wolfCount) {
        ArrayList<Wolf> wolfsCollection = new ArrayList<>(wolfCount);
        for (int i = 0; i < wolfCount; i++) {
            System.out.println("Введите имя волка: ");
            String name = iScanner.nextLine();
            System.out.println("Введите цвет волка: ");
            String color = iScanner.nextLine();
            Wolf wolf = new Wolf(new Random().nextInt(20), new Random().nextInt(100), wolfCount, name, color); //1 + i, 90 + i * 2, 10, 10 + i * 2)
            wolfsCollection.add(wolf);
        }
        
        return wolfsCollection;
    }

}

