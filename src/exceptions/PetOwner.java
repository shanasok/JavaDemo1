package exceptions;

import animals.*;

// Someone who just bought a pet and is trying to bring it home.
public class PetOwner {
    private String name;

    public PetOwner(String name) {
        this.name = name;
    }

    // Some pets just can't live in a normal house. That's not a bug in anyone's code,
    // it's a problem the caller should EXPECT and plan for, so we throw a CHECKED exception.
    // Because of that, this method MUST say "throws MyCheckedException".
    public void bringHome(Animal pet) throws MyCheckedException {
        if (pet instanceof Shark) {
            throw new MyCheckedException(name + " can't keep a shark in the bathtub!");
        }
        if (pet instanceof Penguin) {
            throw new MyCheckedException(name + "'s house is way too warm for a penguin!");
        }
        System.out.println(name + " happily brings home their new pet.");
        pet.makeSound();
    }
}
