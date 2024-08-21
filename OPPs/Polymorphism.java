package OPPs;


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
// Superclass: Animal
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
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

public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3));           // Calls add(int, int)
        System.out.println("Sum of 2, 3, and 4: " + calculator.add(2, 3, 4));   // Calls add(int, int, int)
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5));  // Calls add(double, double)

        // Runtime polymorphism
        Animal myDog = new Dog(); // Animal reference but Dog object
        Animal myCat = new Cat(); // Animal reference but Cat object

        // Calling the overridden sound method
        myDog.sound(); // Outputs: Woof Woof
        myCat.sound(); // Outputs: Meow Meow
    }
}
