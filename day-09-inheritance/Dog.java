/**
 * Dog — a SUBCLASS (child class) of Animal.
 *
 * Dog INHERITS from Animal:
 *   - Fields: name, age (protected — accessible here)
 *   - Methods: eat(), sleep(), getName(), getAge()
 *
 * Dog OVERRIDES from Animal:
 *   - makeSound() — Dogs bark, not generic animal sound
 *   - toString() — includes breed information
 *
 * Dog ADDS its own unique behavior:
 *   - breed field
 *   - fetch() method
 */
public class Dog extends Animal {  // 'extends' = inherit from Animal

    // Dog's OWN field — Animal doesn't have this
    private String breed;

    /**
     * Dog constructor.
     * MUST call super() to initialize inherited Animal fields.
     * super() must be the FIRST statement in the constructor.
     */
    public Dog(String name, int age, String breed) {
        super(name, age);   // calls Animal(name, age) constructor
        // After super() returns, 'name' and 'age' are initialized
        this.breed = breed;
        System.out.println("  [Dog constructor called for breed: " + breed + "]");
    }

    /**
     * OVERRIDES Animal.makeSound().
     * @Override annotation tells compiler: "I intend to override a method"
     * Without it, a typo like "makesound()" would silently create a new method instead!
     */
    @Override
    public void makeSound() {
        System.out.println(name + " barks: WOOF WOOF! 🐕");
        // Notice: we can access 'name' directly because it's 'protected' in Animal
    }

    /**
     * OVERRIDES Animal.eat() and EXTENDS its behavior using super.
     */
    @Override
    public void eat(String food) {
        super.eat(food);  // calls Animal.eat() first
        System.out.println(name + " wags its tail happily!");  // adds dog-specific behavior
    }

    /**
     * Dog-specific method — doesn't exist in Animal.
     */
    public void fetch(String item) {
        System.out.println(name + " fetches the " + item + "! 🎾");
    }

    public String getBreed() { return breed; }

    @Override
    public String toString() {
        // super.toString() calls Animal's toString() — avoids repeating code
        return String.format("Dog[name=%s, age=%d, breed=%s]", name, age, breed);
    }
}
