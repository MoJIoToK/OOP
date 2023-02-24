package S1_CW.WendingMachine;

import java.util.ArrayList;

import S1_CW.product.*;

public class DrinkMachine extends WendingMachine<Drink>{

    protected ArrayList<Drink> drinkList;
    
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
