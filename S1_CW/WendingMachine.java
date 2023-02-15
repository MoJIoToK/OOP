package S1_CW;

import java.util.ArrayList;

public class WendingMachine {
    private String name;
    protected ArrayList<Product> productList;

    protected ArrayList<HotDrink> hotDrinkList;

    public WendingMachine(String firstMachine) {
        this.name = firstMachine;
        this.productList = new ArrayList<Product>();
    }

    public void addProduct (Product product){
        productList.add(product);
    }
    
    public Product getProduct(String name){
        for (Product el: productList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }

    public void printProducts(){
        for (var el: this.productList) {
            System.out.println(el);
        }
    }

}
