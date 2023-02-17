package cage;

import java.util.ArrayList;
import java.util.Random;

import animals.*;

public class LionCage implements AnimalCage{

    private int foodWeight;
    private int garbage;
    private ArrayList<Lion> lions;

    public LionCage(){
        this.lions = new ArrayList<>();
    }

    public void setLions(ArrayList lions){
        this.lions = lions;
    }

    public void setFoodWeight(int foodWeight){
        this.foodWeight = foodWeight;
    }

    public void setGarbage(int garbage){
        this.garbage = garbage;
    }

    @Override
    public int addAnimal(Animal animal) {
        lions.add((Lion) animal);
        return lions.size();
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
        for (Lion lion : lions) {
            System.out.println(lion);                   
        }
        System.out.println(lions.size());
        return String.format("В клетке %d львa(-ов)", lions.size());        
    }

    @Override
    public Lion takeOfAnimal() {
        if(lions == null) return null;

        else{
            Random random = new Random();
            int rand = random.nextInt(lions.size());
            return (Lion) lions.remove(rand);
        }

    }

}
