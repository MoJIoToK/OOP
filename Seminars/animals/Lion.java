package animals;

public class Lion extends Animal implements Comparable<Lion> {
    private int volumeHair;
    protected static final int MAXWEIGHT = 150;
    protected static final String TYPE = "Lion";

    public Lion(int ageOfBirth, int weight, int count, String name, int volumeHair) {
        super(ageOfBirth, weight, count, name);
        this.volumeHair = volumeHair;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return ageOfBirth;
    }

    public int getVolumeHair() {
        return volumeHair;
    }

    public int getMaxWeight() {
        return MAXWEIGHT;
    }
    
    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %d, %d", name, TYPE, ageOfBirth, weight, volumeHair);
    }

    @Override
    public int compareTo(Lion o) {
        if(this.ageOfBirth > o.getAge()) return 1;
        else if(this.ageOfBirth < o.getAge()) return -1;
        return 0;
    }

}
