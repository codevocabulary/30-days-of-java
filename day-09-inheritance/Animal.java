/**
 * Animal — the SUPERCLASS (parent class) in our hierarchy.
 *
 * All animals share: name, age, eat(), sleep(), makeSound()
 * Specific animals ADD their own fields and methods.
 *
 * HIERARCHY:
 *   Animal
 *   ├── Dog
 *   ├── Cat
 *   └── Bird
 */
public class Animal {

    // 'protected' = visible to this class AND all subclasses
    // Better than 'private' for inheritance (subclasses need access)
    // Better than 'public' for encapsulation (outside classes can't touch)
    protected String name;
    protected int    age;

    /**
     * Constructor — initializes every Animal.
     * Subclass constructors MUST call this via super().
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age  = age;
        System.out.println("  [Animal constructor called for: " + name + "]");
    }

    /**
     * makeSound — intended to be OVERRIDDEN by subclasses.
     * Each animal type should provide its own sound.
     */
    public void makeSound() {
        System.out.println(name + " says: ... (generic animal sound)");
    }

    /** All animals eat. */
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    /** All animals sleep. */
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    // Getters
    public String getName() { return name; }
    public int    getAge()  { return age; }

    @Override
    public String toString() {
        return String.format("Animal[name=%s, age=%d]", name, age);
    }
}
