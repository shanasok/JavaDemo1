package animals;

// Goldfish IS-A Fish. It overrides both methods.
public class Goldfish extends Fish {

    public Goldfish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " goes 'blub blub'.");
    }

    @Override
    public void move() {
        System.out.println(name + " swims slowly in circles around its bowl.");
    }
}
