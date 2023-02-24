package S1_CW.WendingMachine;

import java.util.ArrayList;

import S1_CW.product.*;

public class HotDrinkVendingMachine extends WendingMachine<HotDrink> {
    private String name;

    public HotDrink getProducts(String name, int volume, int temperature) {     
        for (Product el : products) {
            if (el instanceof HotDrink) {
                if (el.getName().equals(name) && ((HotDrink) el).getVolume() == volume && 
                ((HotDrink) el).getTemp() == temperature) {
                    return (HotDrink) el;
                }
            }
        }
        return null;
    }

}
