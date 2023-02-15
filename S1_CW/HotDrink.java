package S1_CW;

public class HotDrink extends Drink{
    protected int temperature;

    public HotDrink(String name, int price, int volume, int temperature){
        super(name, price, volume);
        this.temperature = temperature;
    }

    public void setVolume(int temperature) {
        this.temperature = temperature;        
    }

    public int getVolume() {
        return this.volume;        
    }

    public int getTemp() {
        return this.temperature;        
    }

    @Override
    public String toString(){
        return name + ": " + price;
    }

}
