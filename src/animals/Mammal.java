package animals;

// Mammal IS-AN Animal. It overrides move(), but NOT makeSound(),
// so it keeps Animal's version of makeSound().
public class Mammal extends Animal {

    public Mammal(String name) {
        super(name); // calls the Animal constructor
    }

    @Override
    public void move() {
        System.out.println(name + " walks on legs.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats food in a mammal kind of way.");
    }
}
