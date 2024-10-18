package task1.model;

import task1.impleaments.IPlay;
import task1.impleaments.ISwim;

public class Norveg extends Cat implements ISwim, IPlay {

    public Norveg(String name, String color) {
        super(name, color);
    }

    @Override
    public void play() {
        System.out.println("Норвежский котик "+getName()+" играет");
    }

    @Override
    public void wag() {
        System.out.println("Норвежский котик "+getName()+" виляет хвостом");

    }

    @Override
    public void swim() {
        System.out.println("Норвежский котик "+getName()+" плавает");

    }

    @Override
    public String toString() {
        return "Norveg{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
