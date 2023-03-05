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
        System.out.println("\nЛев успешно удален\n");
        return this.lionCage.takeOfAnimal();
    }

    public int addLion(Lion animal){
        System.out.println("\nЛев успешно добавлен\n");
        return this.lionCage.addAnimal(animal);
    }


    public Wolf takeOfWolf(){
        System.out.println("\nВолк успешно удален\n");
        return this.wolfCage.takeOfAnimal();
    }

    public int addWolf(Wolf wolf){
        System.out.println("\nВолк успешно добавлен\n");
        return this.wolfCage.addAnimal(wolf);
    }


    public Snake takeOfSnake(){
        System.out.println("\nЗмея успешно удалена\n");
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

    @Override
    public String toString() {
        int wolfCount = 0;
        int snakeCount = 0;
        int lionCount = 0;
        if(wolfCage != null) wolfCount = wolfCage.countAnimals();
        if(lionCage != null) lionCount = lionCage.countAnimals();
        if(snakeTerrarium != null) snakeCount = snakeTerrarium.countAnimals();
        return "Zoo{wolves=" + wolfCount + ", lions=" + lionCount + ", snakes=" + snakeCount + "}";
    }

    public void printZoo(){
        if(lionCage!=null) System.out.println(lionCage);
        else System.out.println("Lion cage is empty!");
        if(wolfCage!=null) System.out.println(wolfCage);
        else System.out.println("Wolf cage is empty!");
        if(snakeTerrarium!=null) System.out.println(snakeTerrarium);
        else System.out.println("Snake terrarium is empty!");
    }
        
}
