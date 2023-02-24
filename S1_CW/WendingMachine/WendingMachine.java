package S1_CW.WendingMachine;

import S1_CW.product.Product;

import java.util.ArrayList;

public class WendingMachine<T extends Product> {
    private String name;
    protected ArrayList<T> products;

    public ArrayList<T> getProduct(){
        return products;
    }

    public void setProduct(ArrayList<T> products) {
        this.products = products;
    }

    public Product getProducts(String name){
        for (Product el: products) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }

}
