package S1_CW;

import java.util.ArrayList;

public class DrinkMachine extends WendingMachine{

    protected ArrayList<Drink> drinkList;
    
    public DrinkMachine(String secondMachine) {
        super(secondMachine);
        this.drinkList = new ArrayList<Drink>();
    }
    
    public void addDrink(Drink dr){
        drinkList.add(dr);
    }
    
    public Drink returnProduct(String name){
        for (Drink el: drinkList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }

    public void printDrink() {
        for (var el : this.drinkList) {
            System.out.println(el);            
        } 
    }
    
}
