package animals;

// Cat IS-A Mammal. It overrides both methods.
// Notice move() uses super.move() to run Mammal's version first, then adds more.
public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void move() {
        super.move(); // runs Mammal's move() first
        System.out.println(name + " also sneaks and pounces quietly.");
    }
}
