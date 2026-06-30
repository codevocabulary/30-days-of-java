/**
 * DAY 09 — Inheritance
 * ============================================================
 * Inheritance allows a class (subclass) to inherit fields and
 * methods from another class (superclass). This enables:
 *   - Code reuse (don't repeat yourself)
 *   - IS-A relationships (Dog IS-A Animal)
 *   - Building class hierarchies
 *
 * Keyword: extends
 * Project: Animal Kingdom
 * Run: javac *.java && java Main
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== DAY 09: Inheritance ===\n");

        // ============================================================
        // Creating objects of different classes
        // ============================================================

        Animal generic = new Animal("Generic", 5);
        Dog    dog     = new Dog("Rex",    3, "Labrador");
        Cat    cat     = new Cat("Whiskers", 7, true);
        Bird   bird    = new Bird("Tweety", 2, true);

        System.out.println("--- All Animals (using inherited toString) ---");
        System.out.println(generic);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(bird);

        System.out.println("\n--- Making sounds (overridden method) ---");
        generic.makeSound();  // Animal's version
        dog.makeSound();      // Dog OVERRIDES this → different behavior
        cat.makeSound();      // Cat OVERRIDES this → different behavior
        bird.makeSound();     // Bird OVERRIDES this → different behavior

        System.out.println("\n--- Subclass-specific behavior ---");
        dog.fetch("ball");    // Dog-only method — not in Animal!
        cat.purr();           // Cat-only method
        bird.fly();           // Bird-only method

        System.out.println("\n--- Using super: Dog eats (calls Animal.eat then adds dog behavior) ---");
        dog.eat("bone");

        System.out.println("\n--- instanceof checks ---");
        System.out.println("dog instanceof Animal : " + (dog instanceof Animal)); // true: Dog IS-A Animal
        System.out.println("dog instanceof Dog    : " + (dog instanceof Dog));    // true
        System.out.println("dog instanceof Cat    : " + (dog instanceof Cat));    // false!
        System.out.println("cat instanceof Animal : " + (cat instanceof Animal)); // true

        System.out.println("\n--- Polymorphic array (covered fully on Day 10) ---");
        // An Animal[] can hold any subclass object — preview of polymorphism
        Animal[] zoo = { generic, dog, cat, bird };
        for (Animal animal : zoo) {
            System.out.printf("  %-10s says: ", animal.getName());
            animal.makeSound();  // calls the CORRECT override for each object!
        }

        System.out.println("\nDay 09 Complete! Inheritance mastered! ☕");
    }
}
