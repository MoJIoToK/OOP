package animals;

import java.util.Comparator;

public class WolfAgeComparator implements Comparator<Wolf>{

    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {
        if(wolf1.getAge() > wolf2.getAge()) return 1;
        else if(wolf1.getAge() < wolf2.getAge()) return -1;
        return 0;
    }

    // public int compare(Wolf wolf1, Wolf wolf2) {
    //     return (wolf1.getAge() < wolf2.getAge()) ? 1 : ((wolf1.getAge() == wolf2.getAge()) ? 0 : 1);
    // }
    
}
