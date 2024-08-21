package OPPs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Superclass: Animal
abstract class Animal {
    public abstract void sound(); // Abstract method for polymorphism
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

// Class: Calculator
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class streamsAndCollections {
    public static void main(String[] args) {
        // Create a list of Animal objects
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());

        // Use Streams to process the collection of animals
        System.out.println("Animal Sounds:");
        animals.stream()
                .forEach(Animal::sound); // Using method reference to call sound()

        // Compile-time polymorphism with Calculator
        Calculator calculator = new Calculator();
        
        // List of integers to sum
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Using Streams to calculate the sum of the list
        int sum = numbers.stream()
                .mapToInt(Integer::intValue) // Convert Integer to int
                .sum(); // Sum all elements

        System.out.println("Sum of numbers: " + sum); // Outputs: Sum of numbers: 15
    }
}
