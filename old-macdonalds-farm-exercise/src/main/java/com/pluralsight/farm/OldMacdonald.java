package com.pluralsight.farm;

public class OldMacdonald {
    public static void main(String[] args) {
        Farm f = new Farm();
        Animal cow = new Animal("Cow", "Moo");
        f.addAnimal(cow);
//        f.printWholeSong();
        f.addAnimal( new Animal("Chicken", "Cluck"));
//        f.printWholeSong();
        f.addAnimal( new Animal("Anaconda", "Hissssssss"));
//        f.printWholeSong();
    }
}
