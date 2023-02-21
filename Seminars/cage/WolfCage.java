package cage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import animals.*;

public class WolfCage implements AnimalCage, Iterable<Wolf> {

    private int foodWeight;
    private int garbage;
    private static ArrayList<Wolf> wolfs;
    private int cursor;

    public WolfCage(){
        this.wolfs = new ArrayList<>();
    }

    public void setLions(ArrayList wolfs){
        this.wolfs = wolfs;
    }

    public void setFoodWeight(int foodWeight){
        this.foodWeight = foodWeight;
    }

    public void setGarbage(int garbage){
        this.garbage = garbage;
    }

    @Override
    public int addAnimal(Animal animal) {
        if (animal.getType().equals("Wolf")){
            wolfs.add((Wolf) animal);  
        }
        return wolfs.size();
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
        for (Wolf wolf : wolfs) {
            System.out.println(wolf);                   
        }
        System.out.println(wolfs.size());
        return String.format("В клетке %d волка(-ов)", wolfs.size());        
    }

    @Override
    public Wolf takeOfAnimal() {
        if(wolfs == null) return null;

        else{
            Random random = new Random();
            int rand = random.nextInt(wolfs.size());
            return (Wolf) wolfs.remove(rand);
        }
    }

    public void sortWolfsByAge() {
        Collections.sort(wolfs, new WolfAgeComparator());
    }

    public static void sortWolfsWeight() {
        Collections.sort(wolfs, new WolfWeightComparator());
    }
    
    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolfs);
    }


}
