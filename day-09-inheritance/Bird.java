/**
 * Bird — third subclass of Animal.
 * Some birds can fly, some cannot — demonstrates subclass variation.
 */
public class Bird extends Animal {

    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: TWEET TWEET! 🐦");
    }

    public void fly() {
        if (canFly) {
            System.out.println(name + " is soaring through the sky! ✈️");
        } else {
            System.out.println(name + " cannot fly (e.g., penguin).");
        }
    }

    @Override
    public String toString() {
        return String.format("Bird[name=%s, age=%d, canFly=%b]", name, age, canFly);
    }
}
