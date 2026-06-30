/**
 * Cat — another subclass of Animal.
 * Shows how DIFFERENT subclasses can extend the same parent differently.
 */
public class Cat extends Animal {

    private boolean isIndoor;  // cat-specific field

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);   // MUST call Animal's constructor first
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: MEOW! 🐈");
    }

    /** Cat-specific behavior */
    public void purr() {
        System.out.println(name + " is purring contentedly...");
    }

    public boolean isIndoor() { return isIndoor; }

    @Override
    public String toString() {
        return String.format("Cat[name=%s, age=%d, indoor=%b]", name, age, isIndoor);
    }
}
