package exceptions;

import animals.*;

import java.util.ArrayList;
import java.util.Random;

// A pet store with a limited number of pets in stock.
// sellPet() hands you a RANDOM pet, so the buyer never knows what they'll get.
public class PetStore {
    private ArrayList<Animal> pets = new ArrayList<>();
    private Random random = new Random();

    public PetStore() {
        pets.add(new Dog("Rex the Dog"));
        pets.add(new Cat("Whiskers the Cat"));
        pets.add(new Pigeon("Pete the Pigeon"));
        pets.add(new Goldfish("Bubbles the Goldfish"));
        pets.add(new Shark("Bruce the Shark"));
        pets.add(new Penguin("Pingu the Penguin"));
    }

    public boolean hasPets() {
        return !pets.isEmpty();
    }

    // Removes a random pet from the store and returns it.
    // If the store is empty, that's a bug in the CALLER's code (they should have
    // checked hasPets() first), so we throw a RUNTIME exception. No "throws" needed.
    public Animal sellPet() {
        if (pets.isEmpty()) {
            throw new MyRuntimeException("The pet store is sold out!");
        }
        return pets.remove(random.nextInt(pets.size()));
    }
}
