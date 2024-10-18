package task1.model;

import task1.impleaments.IPlay;
import task1.impleaments.ISwim;

public class MayKun extends Cat implements ISwim, IPlay {
    public MayKun(String name, String color) {
        super(name, color);
    }

    @Override
    public void play() {
        System.out.println("Мей Кун котик "+getName()+" играет");
    }

    @Override
    public void wag() {
        System.out.println("Мей Кун котик "+getName()+" виляет хвостом");

    }

    @Override
    public void swim() {
        System.out.println("Мей Кун котик "+getName()+" плавает");

    }

}
