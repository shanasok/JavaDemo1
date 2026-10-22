package animals;

// Dog IS-A Mammal (and therefore also an Animal).
// It overrides makeSound(), but inherits move() from Mammal.
public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
