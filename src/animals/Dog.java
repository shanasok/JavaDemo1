package animals;

// Dog IS-A Mammal (and therefore also an Animal).
// It overrides makeSound(), but inherits move() from Mammal.
public class Dog extends Mammal {

    private boolean hasBone;
    private String breed;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String breed, boolean hasBone) {
        super(name);
        this.breed = breed;
        this.hasBone = hasBone;
    }

    //dog1.equals(dog2);
    //this ------ obj

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog)) return false;
        Dog otherDog = (Dog) obj;
        return this.name.equals(otherDog.name) &&
               this.breed.equals(otherDog.breed) &&
               this.hasBone == otherDog.hasBone;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + breed.hashCode();
        result = 31 * result + (hasBone ? 1 : 0);
        return result;
    }

    // Getters and Setters

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    public boolean getHasBone() {
        return hasBone;
    }

    public void setHasBone(boolean hasBone) {
        this.hasBone = hasBone;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
