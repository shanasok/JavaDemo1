package animals;

// Pigeon IS-A Bird. It overrides makeSound(), but inherits move() from Bird,
// because pigeons fly just like a normal bird.
public class Pigeon extends Bird {

    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Coo coo!");
    }
}
