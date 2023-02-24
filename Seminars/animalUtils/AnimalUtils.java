package animalUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import animals.Animal;

public class AnimalUtils {

    public static <T extends Animal> List<T> sortAnimals (ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalAgeComparator());
        return animalList;
    }

}
