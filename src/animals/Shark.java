package animals;

// Shark IS-A Fish. It inherits makeSound() from Fish,
// but overrides move() to add to Fish's behavior using super.
public class Shark extends Fish {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void move() {
        super.move(); // runs Fish's move() first
        System.out.println(name + " hunts fast and never stops swimming.");
    }


    @Override
    public void eat() {
        System.out.println(name + " eats food with lots of sharp teeth.");
    }
}
