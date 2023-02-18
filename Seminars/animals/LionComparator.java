package animals;

import java.util.Comparator;

public class LionComparator implements Comparator<Lion>{

    @Override
    public int compare(Lion lion1, Lion lion2) {
        if(lion1.getVolumeHair() > lion2.getVolumeHair()) return 1;
        else if(lion1.getVolumeHair() < lion2.getVolumeHair()) return -1;
        return 0;
    }
    
}
