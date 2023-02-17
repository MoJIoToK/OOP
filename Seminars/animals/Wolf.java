package animals;

public class Wolf extends Animal {
    private int volumeHair;
    protected static final int MAXWEIGHT = 150;
    protected static final String TYPE = "Wolf";

    public Wolf(int ageOfBirth, int weight, int count, String name, int volumeHair) {
        super(ageOfBirth, weight, count, name);
        this.volumeHair = volumeHair;
    }

    public String getName(){
        return name;
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

    // @Override
    // public void Feed(int foodWeight) {
    //     if(this.weight + foodWeight <= MAXWEIGHT){
    //         this.weight += foodWeight;
    //     }
    //     else System.out.println("Max weight");
    //     //super.Feed(foodWeight);
    // }

}
