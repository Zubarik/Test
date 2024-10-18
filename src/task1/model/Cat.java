package task1.model;

import task1.impleaments.IVoice;
import task1.impleaments.IWag;

public class Cat extends Pet implements IVoice {
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Котик "+getName()+" мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Котик "+getName()+" ест");

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
