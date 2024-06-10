package vendingMashine;

import vendingMashine.model.Product;
import vendingMashine.model.VendingMachine;
import vendingMashine.model.impl.*;
import vendingMashine.model.impl.Package;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 49.90, LocalDate.of(2024,10,01));
        Product bottle2 = new BottleOfWater("Родники Газированная",
                49.90,
                LocalDate.of(2024,10,01),
                1,
                Package.GLASS.getMatirial(),
                true);
        VendingMachine vm = new WaterVendingMachine();
        System.out.println(vm.getProducts());
        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2));
        System.out.println(vm.getProducts());
        vm.getProduct("Родники");
        System.out.println(vm.getProducts());

        Product coffee1 = new HotDrink("Эспрессо", 50.5,LocalDate.of(2025,01,01), 50, 95);
        Product coffee2 = new HotDrink("Американо", 70.0,LocalDate.of(2025,01,01), 200, 95);
        Product tea1 = new HotDrink("Черный чай", 31D,LocalDate.of(2025,01,01), 250, 98);

        VendingMachine hdvm = new HotDrinkVendingMachine(List.of(coffee1, coffee1, coffee2, coffee1, coffee2, coffee1, coffee2, tea1, tea1));
        System.out.println(hdvm.getProducts());
        hdvm.getProduct("Американо");
        System.out.println(hdvm.getProducts());
    }
}
