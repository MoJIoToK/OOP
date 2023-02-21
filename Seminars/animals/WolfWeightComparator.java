package animals;

import java.util.Comparator;

public class WolfWeightComparator implements Comparator<Wolf>{

    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {
        if(wolf1.getWeight() > wolf2.getWeight()) return 1;
        else if(wolf1.getWeight() < wolf2.getWeight()) return -1;
        return 0;
    }
    
}
