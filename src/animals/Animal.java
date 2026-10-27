package animals;

// The base class (also called the "parent" or "superclass").
// Every other animal in this demo extends Animal, so they all inherit its fields and methods.
public class Animal {
    protected String name;
    protected boolean extinct;

    public Animal(String name) {
        this(name, false);
        this.name = name;
    }

    public Animal(String name, boolean extinct) {
        super();
        this.name = name;
        this.extinct = extinct;
    }

    // Method #1: every animal inherits this. Subclasses can override it.
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }

    // Method #2: every animal inherits this too.
    public void move() {
        System.out.println(name + " moves around.");
    }

    public void eat(){
        System.out.println("Eating food...");
    }

}
