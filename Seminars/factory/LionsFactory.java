package factory;

import animals.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LionsFactory {
    public static Scanner iScanner = new Scanner(System.in);

    static public ArrayList<Wolf> createLions (int lionCount) {
        ArrayList<Wolf> lionsCollection = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            System.out.println("Введите имя льва: ");
            String name = iScanner.nextLine();
            Wolf lion = new Wolf(1 + i, 90 + i, lionCount, name, 10 + i * 2); //1 + i, 90 + i * 2, 10, 10 + i * 2)
            lionsCollection.add(lion);
        }
        
        return lionsCollection;
    }

}

