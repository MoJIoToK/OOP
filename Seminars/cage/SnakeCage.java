package cage;

import java.util.ArrayList;
import java.util.Random;
import animals.*;

public class SnakeCage implements AnimalCage<Snake> {

    private int foodWeight;
    private int garbage;
    private static ArrayList<Snake> snakes;

    public SnakeCage(){
        this.snakes = new ArrayList<>();
    }

    public void setSnakes(ArrayList snakes){
        this.snakes = snakes;
    }

    public void setFoodWeight(int foodWeight){
        this.foodWeight = foodWeight;
    }

    public void setGarbage(int garbage){
        this.garbage = garbage;
    }

    @Override
    public int addAnimal(Snake animal) {
        if (animal.getType().equals("Snake")){
            snakes.add(animal);  
        }
        return snakes.size();
    }

    @Override
    public void deliverFood(int wietghOfFood) {
        int tempFood = wietghOfFood + this.foodWeight;
        for (Snake snake : snakes) {
            if (snake.getWeight() < snake.getMaxWeight() + wietghOfFood){
                snake.Feed(wietghOfFood);
            }
        else {
            System.out.println("Snake is well-fed");
            this.garbage = tempFood;}
        }
    }

    @Override
    public void cleanCage(int garbage) {
        if (garbage < this.garbage){
            this.garbage -= garbage;
        }
        else this.garbage = 0;
    }

    @Override
    public String toString() {
        for (Snake snake : snakes) {
            System.out.println(snake);                   
        }
        return String.format("В террариуме %d змея(-и)\n", snakes.size());        
    }

    @Override
    public Snake takeOfAnimal() {
        if(snakes.isEmpty()) {
            System.out.println("Cage is empty");
            return null;
        } 
        else{
            Random random = new Random();
            int rand = random.nextInt(snakes.size());
            return (Snake) snakes.remove(rand);
        }
    }

    @Override
    public void sortByAge(ArrayList<Snake> animalList) {
        AnimalCage.super.sortByAge(animalList);
    }

    @Override
    public int countAnimals() {
        return snakes.size();
    }

    public void printCage(){
        for (Snake el: snakes
             ) {
            System.out.println(el);
        }
    }
}
