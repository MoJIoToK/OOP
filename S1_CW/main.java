package S1_CW;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        WendingMachine productMachine = new WendingMachine("first machine");
        DrinkMachine drinkMachine = new DrinkMachine("second machine");
        HotDrinkVendingMachine hotDrinkMachine = new HotDrinkVendingMachine("third machine");
        
        Product firstProduct = new Product("Орехи", 100);
        Product secondProduct = new Product("Минералка", 150);
        productMachine.addProduct(firstProduct);
        productMachine.addProduct(secondProduct);
        
        Drink firstDrink = new Drink("Cola", 10, 100);
        Drink secondDrink = new Drink("Какао", 15, 150);
        drinkMachine.addDrink(firstDrink);
        drinkMachine.addDrink(secondDrink);

        HotDrink cofe = new HotDrink("Cofe", 10, 200, 70);
        HotDrink tea = new HotDrink("Green Tea", 20, 250, 60);
        hotDrinkMachine.addHotDrink(cofe);
        hotDrinkMachine.addHotDrink(tea);

        ArrayList<Product> products = new ArrayList<>();
        products.add(firstProduct);
        products.add(secondProduct);
        products.add(firstDrink);
        products.add(secondDrink);
        products.add(cofe);
        products.add(tea);
        
        System.out.println();
        System.out.println(hotDrinkMachine.getProduct("Green Tea", 250, 60));
        System.out.println(hotDrinkMachine.getProduct("Cofe", 200, 70));

    }
    
}