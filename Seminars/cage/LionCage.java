package cage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import animals.*;

public class LionCage implements AnimalCage<Lion>{

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
    public int addAnimal(Lion animal) {
        if (animal.getType().equals("Lion")){
            lions.add(animal);  
        }
        return lions.size();
    }

    @Override
    public void deliverFood(int wietghOfFood) {
        int tempFood = wietghOfFood + this.foodWeight;
        for (Lion lion : lions) {
            if (lion.getWeight() < lion.getMaxWeight() + wietghOfFood){
                lion.Feed(wietghOfFood);
            }
        else {
            System.out.println("Lion is well-fed");
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
        for (Lion lion : lions) {
            System.out.println(lion);                   
        }
        return String.format("В клетке %d львa(-ов)\n", lions.size());        
    }

    @Override
    public Lion takeOfAnimal() {
        if(lions.isEmpty()) {
            System.out.println("Cage is empty");
            return null;
        } 
        else{
            Random random = new Random();
            int rand = random.nextInt(lions.size());
            return (Lion) lions.remove(rand);
        }
    }

    public void sortLions() {
        Collections.sort(lions);  
    }

    public void sortLionsByVolumeHair() {
        Collections.sort(lions, new LionComparator());
    }

    public void printCage(){
        for (Lion el: lions
             ) {
            System.out.println(el);
        }
    }

    @Override
    public int countAnimals() {
        return lions.size();
    }

}
