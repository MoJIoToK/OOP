package factory;

import animals.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SnakesFactory {

    static public ArrayList<Snake> createSnakes (int snakeCount) {
        ArrayList<Snake> snakesCollection = new ArrayList<>(snakeCount);
        for (int i = 0; i < snakeCount; i++) {

            Snake snake = new Snake(i, i, snakeCount, "name" + i, i);
            snakesCollection.add(snake);
        }
        
        return snakesCollection;
    }

}

