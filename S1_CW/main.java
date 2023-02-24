package S1_CW;

import java.util.ArrayList;

import S1_CW.WendingMachine.*;
import S1_CW.product.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Drink> drinks = new ArrayList<>();
        ArrayList<HotDrink> hotDrinks = new ArrayList<>();

        WendingMachine productMachine = new WendingMachine();
        DrinkMachine drinkMachine = new DrinkMachine();
        HotDrinkVendingMachine hotDrinkMachine = new HotDrinkVendingMachine();
        
        Product firstProduct = new Product("Орехи", 100);
        Product secondProduct = new Product("Чипсы", 150);
        
        Drink firstDrink = new Drink("Cola", 10, 100);
        Drink secondDrink = new Drink("Какао", 15, 150);
        
        HotDrink cofe = new HotDrink("Cofe", 10, 200, 70);
        HotDrink tea = new HotDrink("Green Tea", 20, 250, 60);
        
        products.add(firstProduct);
        products.add(secondProduct);
        drinks.add(firstDrink);
        drinks.add(secondDrink);
        hotDrinks.add(cofe);
        hotDrinks.add(tea);

        productMachine.setProduct(products);
        drinkMachine.setProduct(drinks);
        hotDrinkMachine.setProduct(hotDrinks);
        
        System.out.println();
        System.out.println(productMachine.getProducts("Орехи"));
        System.out.println(drinkMachine.getProducts("Cola"));
        System.out.println(hotDrinkMachine.getProducts("Green Tea", 250, 60));

    }
    
}