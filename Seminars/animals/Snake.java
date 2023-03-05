package animals;

public class Snake extends Animal {
    private int lenghtBody;
    protected static final int MAXWEIGHT = 5;
    protected static final String TYPE = "Snake";

    public Snake(String name, int ageOfBirth, int weight, int count, int lenghtBody) {
        super(name, ageOfBirth, weight, count);
        this.lenghtBody = lenghtBody;
    }

    public int getLenghtBody() {
        return lenghtBody;
    }

    public int getMaxWeight() {
        return MAXWEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    // @Override
    // public void Feed(int foodWeight) {
    //     while(weight < MAXWEIGHT){
    //         weight += foodWeight;
    //     }
    //     System.out.println("Max weight");
    //     //super.Feed(foodWeight);
    // }

}