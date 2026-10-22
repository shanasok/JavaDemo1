import animals.*;
import exceptions.ExceptionDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== INHERITANCE DEMO =====\n");

        // Polymorphism: every object is stored as an Animal,
        // but Java calls the version of the method that belongs to the REAL class.
        Animal[] animals = {
                new Animal("Generic Animal"),
                new Mammal("Generic Mammal"),
                new Bird("Generic Bird"),
                new Fish("Generic Fish"),
                new Dog("Rex the Dog"),
                new Cat("Whiskers the Cat"),
                new Penguin("Pingu the Penguin"),
                new Pigeon("Pete the Pigeon"),
                new Shark("Bruce the Shark"),
                new Goldfish("Bubbles the Goldfish")
        };

        for (Animal animal : animals) {
            System.out.println("--- " + animal.getClass().getSimpleName() + " ---");
            animal.makeSound();
            animal.move();
            System.out.println();
        }

        System.out.println("===== EXCEPTIONS DEMO =====\n");
        ExceptionDemo.run();
    }
}
