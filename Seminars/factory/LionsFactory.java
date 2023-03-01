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
            //System.out.println("Введите имя льва: ");
            //String name = iScanner.nextLine();
            Lion lion = new Lion(1 + i, 90 + i, 4, "name" + i, new Random().nextInt(50)); //1 + i, 90 + i * 2, 10, 10 + i * 2)
            lionsCollection.add(lion);
        }
        
        return lionsCollection;
    }

}

