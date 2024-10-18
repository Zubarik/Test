package task1.model;

import task1.impleaments.ISwim;
import task1.impleaments.IWag;

public class Fish extends Pet implements ISwim, IWag {
    public Fish() {
    }

    public Fish(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("Рыбка "+getName()+" плавает");
    }

    @Override
    public void wag() {
        System.out.println("Рыбка "+getName()+" виляет хвастом");

    }

    @Override
    public void eat() {
        System.out.println("Рыбка "+getName()+" ест");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
