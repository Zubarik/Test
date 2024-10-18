package task1.model;

import task1.impleaments.IPlay;
import task1.impleaments.ISwim;
import task1.impleaments.IVoice;

public class Dog extends Pet implements IVoice, IPlay, ISwim {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Собачка "+getName()+" ест");
    }

    @Override
    public void play() {
        System.out.println("Собачка "+getName()+" играет");

    }

    @Override
    public void swim() {
        System.out.println("Собачка "+getName()+" плавает");

    }

    @Override
    public void voice() {
        System.out.println("Собачка "+getName()+" лает");

    }

    @Override
    public void wag() {
        System.out.println("Собачка "+getName()+" виляет хвостом");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
