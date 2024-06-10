package vendingMashine.model;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }
    public VendingMachine(List<Product> products) { //внес правки, а то если в констуктор передать List.of(), то создавался неизменяемый список
        this.products = new ArrayList<>();
        this.products.addAll(products);
    }
    public List<Product> getProducts() {
        return products;
    }

    public void addProducts(List<Product> products){
        this.products.addAll(products);
    }

    public Product getProduct(String name){
        for (Product product: products) {
            if (product.getName().equals(name)){
                Product result = product;
                products.remove(result);
                return result;
            }
        }
        throw new RuntimeException("No such product: " + name);
    }
}
