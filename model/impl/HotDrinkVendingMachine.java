package vendingMashine.model.impl;

import vendingMashine.model.Product;
import vendingMashine.model.VendingMachine;

import java.util.List;
import java.util.Scanner;

public class HotDrinkVendingMachine extends VendingMachine {
    private static int sugar;
    private static int getSugar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько вам сахара (от 0 до 5 порций): ");
        if (scanner.hasNextInt()) {
            int sugar = scanner.nextInt();
            if (sugar <=5) return sugar;
            return 5;
        }
        return 0;

    }
    public HotDrinkVendingMachine(Product coffee1, Product product, Product coffee2, Product coffee11, Product coffee21, Product product1, Product coffee22, Product tea1, Product tea11) {
        this.sugar = 0;
    }

    public HotDrinkVendingMachine(List<Product> products) {
        super(products);
    }
    public HotDrinkVendingMachine(int sugar) {
        this.sugar = sugar;
    }


    public Product getProduct(String name){
        for (Product product: products) {
            if (product.getName().equals(name)){
                Product result = product;
                products.remove(result);
                int sugar = getSugar();
                if (this.sugar >= sugar)
                    this.sugar -= sugar;
                else
                    System.out.println("Сахар закончился");
                return result;
            }
        }
        throw new RuntimeException("No such product: " + name);
    }
}
