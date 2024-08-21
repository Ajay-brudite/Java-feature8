package OPPs;

// Abstract class: Animal
abstract class Animal {
    // Abstract method (no body)
    public abstract void sound();

    // Concrete method
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}
// Subclass: Dog
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}

// Subclass: Cat
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }
}
// Interface: Playable
interface Playable {
    void play();
}
// Class: Dog that implements Playable interface
class PlayableDog extends Dog implements Playable {
    @Override
    public void play() {
        System.out.println("The dog is playing fetch.");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog();
        dog.sound();  // Calls the overridden sound method
        dog.sleep();  // Calls the concrete method from Animal
        
        // Create a Cat object
        Cat cat = new Cat();
        cat.sound();  // Calls the overridden sound method
        cat.sleep();  // Calls the concrete method from Animal
        
        // Create a PlayableDog object
        PlayableDog playableDog = new PlayableDog();
        playableDog.sound();  // Calls the overridden sound method
        playableDog.sleep();  // Calls the concrete method from Animal
        playableDog.play();   // Calls the play method from Playable interface
    }
}
