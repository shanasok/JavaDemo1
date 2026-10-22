package exceptions;

import animals.Animal;

public class ExceptionDemo {

    public static void run() {
        PetStore store = new PetStore();

        // The store only has 6 pets, but 7 customers show up.
        // The programmer forgot to check store.hasPets() before selling. That's a real bug!
        String[] customers = {"Alice", "Bob", "Carmen", "Dev", "Eli", "Fatima", "Gus"};

        for (String customerName : customers) {
            PetOwner owner = new PetOwner(customerName);

            // 1) Runtime exception: sellPet() compiles fine with NO try/catch.
            //    On the 7th customer the store is empty and it throws MyRuntimeException.
            //    The right fix is to check store.hasPets() first, not to add a try/catch.
            //    Try changing the loop to stop when !store.hasPets() and the crash goes away.
            Animal pet = store.sellPet();
            System.out.println(customerName + " bought a pet.");

            // 2) Checked exception: bringHome() declares "throws MyCheckedException",
            //    so the compiler FORCES us to handle it. Remove the try/catch and it won't compile.
            try {
                owner.bringHome(pet);
            } catch (MyCheckedException e) {
                System.out.println("Caught checked exception: " + e.getMessage());
                System.out.println(customerName + " takes the pet back to the store.");
            }
            System.out.println();
        }

        // We never get here: the uncaught runtime exception crashes the program first.
        System.out.println("Everyone went home happy!");
    }
}
