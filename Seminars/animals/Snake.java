package animals;

public class Snake extends Animal {
    private int lenghtBody;
    protected static final int MAXWEIGHT = 5;
    protected static final String TYPE = "Snake";

    public Snake(int ageOfBirth, int weight, int count, String name, int lenghtBody) {
        super(ageOfBirth, weight, count, name);
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