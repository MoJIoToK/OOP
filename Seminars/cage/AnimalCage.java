package cage;

import java.util.ArrayList;
import java.util.Collections;
import animalUtils.AnimalAgeComparator;
import animals.*;

public interface AnimalCage<T extends Animal> {

    int addAnimal(T animal);

    void deliverFood(int wietghOfFood);

    void cleanCage(int garbage);

    T takeOfAnimal();

    int countAnimals();

    void printCage();

    default void sortByAge(ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalAgeComparator());
    }
    
}
