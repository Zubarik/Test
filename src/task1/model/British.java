package task1.model;

import task1.impleaments.IPlay;

public class British extends Cat implements IPlay {
    public British(String name, String color) {
        super(name, color);
    }

    @Override
    public void play() {
        System.out.println("Британский котик "+getName()+" неохотно играет");
    }

    @Override
    public void wag() {
        System.out.println("Британский котик "+getName()+" виляет хвостом");

    }

    @Override
    public String toString() {
        return "British{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
