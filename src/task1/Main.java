package task1;

import task1.impleaments.ISwim;
import task1.impleaments.IVoice;
import task1.model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Pet[] pets = {
                new Dog("Sharik","black"),
                new Fish("Okun","orang"),
                new Norveg("Murzik","whil"),
                new British("Wiskas","red"),
                new MayKun("Chacha","green"),
        };

        System.out.println("2.11-----------------------------------");
        for (Pet pet : pets) {
            System.out.println(pet);
        }

        System.out.println("2.12-----------------------------------");
        for (Pet pet : pets) {
            pet.eat();
        }

        System.out.println("2.13-----------------------------------");
        System.out.println("Подают голос");
        IVoice[] voicDable =new IVoice[pets.length];
        int index=0;
        for (Pet pet : pets) {
            if (pet instanceof IVoice){
                voicDable[index++]=(IVoice) pet;
            }
        }
        voicDable= Arrays.copyOf(voicDable,index);
        for (IVoice iVoice : voicDable) {
            System.out.println(iVoice);
            iVoice.voice();
        }

        System.out.println("2.14-----------------------------------");
        for (Pet pet : pets) {
            if (pet instanceof Cat){
                pet.eat();
            }
        }

        System.out.println("2.15-----------------------------------");
        for (Pet pet : pets) {
            if (pet instanceof Fish){
                ((Fish) pet).swim();
            }
        }

        System.out.println("2.16-----------------------------------");
        for (Pet pet : pets) {
            if (pet instanceof IVoice){
                ((IVoice) pet).voice();
            }
        }

        System.out.println("2.17-----------------------------------");
        for (Pet pet : pets) {
            if (pet instanceof ISwim){
                ((ISwim) pet).swim();
            }
        }

        System.out.println("2.18-----------------------------------");
        for (Pet pet : pets) {
            if (pet instanceof ISwim && pet instanceof Cat){
                ((ISwim) pet).swim();
            }
        }

    }
}
