package animals;

public abstract class Animal {
    protected int ageOfBirth;
    protected int weight;
    protected int countOfLimbs;
    protected String name;

    public Animal(int ageOfBirth, int weight, int count, String name) {
        this.ageOfBirth = ageOfBirth;
        this.weight = weight;
        this.countOfLimbs = count;
        this.name = name;
    }

    public void Feed(int foodWeight) { 
        if(this.weight + foodWeight <= getMaxWeight()){
            this.weight += foodWeight;
        }
        else System.out.println("Max weight");
    }

    public abstract int getMaxWeight();
    
    public int getAge() {
        return ageOfBirth;
    }

    public int getWeight() {
        return weight;
    }

    public int getCountOfLimbs() {
        return countOfLimbs;
    }

    public abstract String getType();

}

