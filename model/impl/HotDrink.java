package vendingMashine.model.impl;

import vendingMashine.model.Product;

import java.time.LocalDate;

public class HotDrink extends Product {

    private int temperature;
    private int volume;
    private String pack;
    public HotDrink(String name, Double price, LocalDate releaseDate, int volume, int temperature) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.temperature = temperature;
        if (volume < 150)
            this.pack = Package.PAPER_CUP_150.getMatirial();
        else
            this.pack = Package.PAPER_CUP_300.getMatirial();
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", volume=" + volume +
                ", pack='" + pack + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
