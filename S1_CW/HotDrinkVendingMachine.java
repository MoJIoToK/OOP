package S1_CW;

import java.util.ArrayList;

import S1_CW.HotDrink;
import S1_CW.Product;

public class HotDrinkVendingMachine extends WendingMachine {
    private String name;
    protected ArrayList<HotDrink> hotDrinkList;

    public HotDrinkVendingMachine(String thirdMachine){
        super(thirdMachine);
        this.name = thirdMachine;
        this.hotDrinkList = new ArrayList<HotDrink>();
    }

    public void addHotDrink(HotDrink hd) {
        hotDrinkList.add(hd);        
    }

    public void printHotDrink(){
        for (var el: this.hotDrinkList) {
            System.out.println(el);
        }
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product el : hotDrinkList) {
            //System.out.println((HotDrink) el);
            if (el instanceof HotDrink) {
                if (el.name.equals(name) && ((HotDrink) el).volume == volume && ((HotDrink) el).temperature == temperature) {
                    return (HotDrink) el;
                }
            }
        }
        return null;
    }

}
