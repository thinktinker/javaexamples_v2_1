package l_oop_addon.abstract_class;

// Abstract class
abstract class Animal {
    public Animal() {
        // System.out.println("An animal is created.");    // Constructor
    }

    public abstract void makeSound();                   // Abstract method (must be implemented by subclasses)

    public void eat() {                                 // Concrete method (can be used as-is or overridden by subclasses)
        System.out.println("This animal eats food.");
    }

    public final void breathe() {                       // Final method (CANNOT be overridden by subclasses)
        System.out.println("All animals breathe.");
    }

    public static void info() {                         // Static method (can be called without creating an object)
        System.out.println("Animals are living beings.");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Barks!");
    }

}

class Bird extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Chirps!");
    }
}

class Main{
    public static void main(String[] args) {

        Dog pet1 = new Dog();   // constructor is invoked
        pet1.makeSound();       // Barks!
        pet1.eat();             // invoke abstract class method: eat()
        pet1.breathe();         // invoke abstract class method: breathe()

        Dog.info();             // Do NOT need to instantiate the Dog class to invoke info()

        Bird pet2 = new Bird(); // A new Class
        pet2.makeSound();       // Chirps!
    }
}