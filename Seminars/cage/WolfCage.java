package cage;

import java.util.ArrayList;
import java.util.Random;

import animals.*;

public class WolfCage implements AnimalCage{

    private int foodWeight;
    private int garbage;
    private ArrayList<Wolf> wolf;

    public WolfCage(){
        this.wolf = new ArrayList<>();
    }

    public void setLions(ArrayList lions){
        this.wolf = lions;
    }

    public void setFoodWeight(int foodWeight){
        this.foodWeight = foodWeight;
    }

    public void setGarbage(int garbage){
        this.garbage = garbage;
    }

    @Override
    public int addAnimal(Animal animal) {
        wolf.add((Wolf) animal);
        return wolf.size();
    }

    @Override
    public int deliverFood(int wietghOfFood) {
        return 0;
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
        for (Wolf lion : wolf) {
            System.out.println(lion);                   
        }
        System.out.println(wolf.size());
        return String.format("В клетке %d волка(-ов)", wolf.size());        
    }

    @Override
    public Wolf takeOfAnimal() {
        if(wolf == null) return null;

        else{
            Random random = new Random();
            int rand = random.nextInt(wolf.size());
            return (Wolf) wolf.remove(rand);
        }
          
    }

}
