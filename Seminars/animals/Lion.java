package animals;

public class Lion extends Animal implements Comparable<Lion> {
    private int volumeHair;
    protected static final int MAXWEIGHT = 150;
    protected static final String TYPE = "Lion";

    public Lion(String name, int ageOfBirth, int weight, int count, int volumeHair) {
        super(name, ageOfBirth, weight, count);
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
        return Integer.compare(o.ageOfBirth, this.ageOfBirth);
    }

}
