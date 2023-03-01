package cage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import animals.*;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {

    private int foodWeight;
    private int garbage;
    private static ArrayList<Wolf> wolfs;
    private int cursor;

    public WolfCage(){
        this.wolfs = new ArrayList<>();
    }

    public void setWolfs(ArrayList wolfs){
        this.wolfs = wolfs;
    }

    public void setFoodWeight(int foodWeight){
        this.foodWeight = foodWeight;
    }

    public void setGarbage(int garbage){
        this.garbage = garbage;
    }

    @Override
    public int addAnimal(Wolf animal) {
        if (animal.getType().equals("Wolf")){
            wolfs.add(animal);  
        }
        return wolfs.size();
    }

    @Override
    public void deliverFood(int wietghOfFood) {
        int tempFood = wietghOfFood + this.foodWeight;
        for (Wolf wolf : wolfs) {
            if (wolf.getWeight() < wolf.getMaxWeight() + wietghOfFood){
                wolf.Feed(wietghOfFood);
            }
        else {
            System.out.println("Wolf is well-fed");
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
        for (Wolf wolf : wolfs) {
            System.out.println(wolf);                   
        }
        return String.format("\nВ клетке %d волка(-ов)", wolfs.size());        
    }

    @Override
    public Wolf takeOfAnimal() {
        if(wolfs.isEmpty()) {
            System.out.println("Cage is empty");
            return null;
        } 
        else{
            Random random = new Random();
            int rand = random.nextInt(wolfs.size());
            return (Wolf) wolfs.remove(rand);
        }
    }

    public static void sortWolfsByAge() {
        Collections.sort(wolfs, new WolfAgeComparator());
    }

    public static void sortWolfsWeight() {
        Collections.sort(wolfs, new WolfWeightComparator());
    }

    public static void sortWolfsWeightAge() {
        Collections.sort(wolfs, new WolfWeightAgeComparator());
    }
    
    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolfs);
    }

}
