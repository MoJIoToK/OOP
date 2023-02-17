package cage;

import animals.*;

public interface AnimalCage {

    int addAnimal(Animal animal);

    int deliverFood(int wietghOfFood);

    void cleanCage(int garbage);

    Animal takeOfAnimal();
    
}
