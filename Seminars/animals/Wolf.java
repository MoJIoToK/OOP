package animals;

public class Wolf extends Animal implements Comparable<Wolf> {
    private String color;
    protected static final int MAXWEIGHT = 100;
    protected static final String TYPE = "Wolf";

    public Wolf(int ageOfBirth, int weight, int count, String name, String color) {
        super(ageOfBirth, weight, count, name);
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return ageOfBirth;
    }

    public String getColor() {
        return color;
    }

    public int getWeight(){
        return weight;
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
        return String.format("%s, %s, %d, %d, %s", name, TYPE, ageOfBirth, weight, color);
    }

    @Override
    public int compareTo(Wolf o) {
        if(this.ageOfBirth > o.getAge()) return 1;
        else if(this.ageOfBirth < o.getAge()) return -1;
        return 0;
    }

}
