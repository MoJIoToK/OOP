package zoo;

import animals.*;
import cage.*;

public class Zoo{
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeTerrarium;

    public Zoo (AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeTerrarium){
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeTerrarium = snakeTerrarium;
    }


    public Lion takeOfLion(){
        return this.lionCage.takeOfAnimal();
    }

    public int addLion(Lion animal){
        return this.lionCage.addAnimal(animal);
    }


    public Wolf takeOfWolf(){
        return this.wolfCage.takeOfAnimal();
    }

    public int addWolf(Wolf wolf){
        System.out.println(wolf);
        return this.wolfCage.addAnimal(wolf);
    }


    public Snake takeOfSnake(){
        return this.snakeTerrarium.takeOfAnimal();
    }

    public int addSnake(Snake animal){
        return this.snakeTerrarium.addAnimal(animal);
    }


    public AnimalCage<Wolf> getWolfCage(){
        return wolfCage;
    }

    public void setWolfCage(AnimalCage<Wolf> wolfCage){
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Lion> getLionCage(){
        return lionCage;
    }

    public void setLionCage(AnimalCage<Lion> lionCage){
        this.lionCage = lionCage;
    }

    public AnimalCage<Snake> getSnakeTerrarium(){
        return snakeTerrarium;
    }

    public void setSnakeTerrarium(AnimalCage<Snake> snakeTerrarium){
        this.snakeTerrarium = snakeTerrarium;
    }

    public void printWolfCage(){
        System.out.println(wolfCage);
    }

    public void printLionCage(){
        System.out.println(lionCage);
    }

    public void printSnakeCage(){
        System.out.println(snakeTerrarium);
    }
        
}
