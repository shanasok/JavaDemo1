package animals;

// Penguin IS-A Bird, but penguins can't fly!
// So it overrides move() to replace Bird's "flies" behavior completely.
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " squawks loudly.");
    }

    @Override
    public void move() {
        System.out.println(name + " waddles on land and swims underwater (no flying!).");
    }
}
