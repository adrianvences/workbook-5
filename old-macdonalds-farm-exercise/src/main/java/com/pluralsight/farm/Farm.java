package com.pluralsight.farm;

import java.util.ArrayList;

public class  Farm {

    private ArrayList<Animal> animals = new ArrayList<>();

    // The way the song works:
    // Each time we add a new animal
    // Sing part 1 with the new animal
    // Sing part 2 with the new animal
    // sing part 2 for each of the preexisting animals
    // Finally, sing part 3

//    String song = """
//            (Verse)
//            Old MacDonald had a farm, E-I-E-I-O!
//            And on his farm he had a %s, E-I-E-I-O!
//            (Refrain)
//            With a %s-%s here and a %s-%s there,
//            Here a %s, there a %s,
//            Everywhere a %s-%s,
//            (Coda)
//            Old MacDonald had a farm, E-I-E-I-O!
//            """;

    String part1 = """
            Old MacDonald had a farm, E-I-E-I-O!
            And on his farm he had a %s, E-I-E-I-O!
            """;
    String part2 = """
            With a %s-%s here and a %s-%s there,
            Here a %s, there a %s,
            Everywhere a %s-%s,
            """;
    String part3 = """
            Old MacDonald had a farm, E-I-E-I-O!
            """;

    private void sing(Animal newAnimal) {
        // Sing part 1
        System.out.printf(part1, newAnimal.getName());

        // Sing part 2 with the new animal
        System.out.printf(part2, newAnimal.getSound(), newAnimal.getSound(), newAnimal.getSound(), newAnimal.getSound(),
                newAnimal.getName(), newAnimal.getName(),
                newAnimal.getName(), newAnimal.getSound());

        // Sing part 2 for each existing animal
        for (Animal animal : animals) {
            if (!animal.equals(newAnimal)) { // Avoid repeating the new animal
                System.out.printf(part2, animal.getSound(), animal.getSound(), animal.getSound(), animal.getSound(),
                        animal.getName(), animal.getName(),
                        animal.getName(), animal.getSound());
            }
        }

        // Sing part 3
        System.out.println(part3);
    }



//    public void printOneVerse(String name, String sound){
//        System.out.printf(song, name, sound, sound, sound, sound,sound, sound, sound, sound);
//
//    }

//    public void printWholeSong(){
//        for (Animal a: animals){
//            printOneVerse(a.getName(), a.getSound());
//        }
//    }

    public void addAnimal(Animal a) throws BadAnimalException {
        if(a == null) throw new BadAnimalException("Bad animal!!!");

        // TODO What is correct response here?

        animals.add(a);
        sing(a);
    }

}
