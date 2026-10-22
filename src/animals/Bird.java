package animals;

// Bird IS-AN Animal. It overrides both methods.
public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }

    @Override
    public void move() {
        System.out.println(name + " flies through the air.");
    }
}
