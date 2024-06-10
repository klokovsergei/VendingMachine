package vendingMashine.model.impl;

import vendingMashine.model.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {
    private float volume;
    private String pack;
    private boolean isSparkling;
    public BottleOfWater(String name, Double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSparkling = false;
        this.volume = 1;
        this.pack = Package.PLASTIC.getMatirial();
    }
    public BottleOfWater(String name, Double price, LocalDate releaseDate, float volume, String pack, boolean isSparkling) {
        super(name, price, releaseDate);
        this.isSparkling = isSparkling;
        this.volume = volume;
        this.pack = pack;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack.toString();
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSparkling=" + isSparkling +
                '}';
    }
}
